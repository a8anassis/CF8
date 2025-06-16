package gr.aueb.cf.ch18.mobilecontacts.dao;

import gr.aueb.cf.ch18.mobilecontacts.model.MobileContact;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MobileContactDAOImpl implements IMobileContactDAO {

    private static final List<MobileContact> contacts = new ArrayList<>();

    @Override
    public MobileContact insert(MobileContact mobileContact) {
        if (mobileContact == null) return null;
        contacts.add(mobileContact);
        return mobileContact;
    }

    @Override
    public MobileContact update(long id, MobileContact mobileContact) {
        int position;
        position = getIndexById(id);
        if (position == -1) return null;
        contacts.set(position, mobileContact);
        return mobileContact;
    }

    @Override
    public void deleteById(long id) {
        contacts.removeIf(c -> c.getId() == id);
    }

    @Override
    public MobileContact getById(long id) {
        if (getIndexById(id) == -1) return null;
        return contacts.get(getIndexById(id));
    }

    @Override
    public List<MobileContact> getAll() {
        // return List.copyOf(contacts);        // immutable
        return new ArrayList<>(contacts);       // fresh copy mutable
        //return contacts; // bad to return references
    }

    @Override
    public void deleteByPhoneNumber(String phoneNumber) {
        contacts.removeIf(c -> c.getPhoneNumber().equals(phoneNumber));
    }

    @Override
    public Optional<MobileContact> getByPhoneNumber(String phoneNumber) {
        return contacts.stream()
                .filter(c -> c.getPhoneNumber().equals(phoneNumber))
                .findFirst();
    }

    @Override
    public boolean contactIdExists(long id) {
        // return contacts.contains(getById(id));
        return contacts.stream().anyMatch(c -> c.getId() == id);
    }

    @Override
    public boolean phoneNumberExists(String phoneNumber) {
        return contacts.stream().anyMatch(c -> c.getPhoneNumber().equals(phoneNumber));
    }

    private int getIndexById(long id) {
        int positionToReturn = -1;

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getId() == id) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }
}
