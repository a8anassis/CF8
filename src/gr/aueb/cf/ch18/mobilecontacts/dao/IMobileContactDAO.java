package gr.aueb.cf.ch18.mobilecontacts.dao;

import gr.aueb.cf.ch18.mobilecontacts.model.MobileContact;

import java.util.List;
import java.util.Optional;

public interface IMobileContactDAO {
    MobileContact insert(MobileContact mobileContact);
    MobileContact update(long id, MobileContact mobileContact);
    void deleteById(long id);
    MobileContact getById(long id);
    List<MobileContact> getAll();

    void deleteByPhoneNumber(String phoneNumber);
    Optional<MobileContact> getByPhoneNumber(String phoneNumber);
    boolean contactIdExists(long id);
    boolean phoneNumberExists(String phoneNumber);
}
