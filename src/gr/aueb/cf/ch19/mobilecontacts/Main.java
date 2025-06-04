package gr.aueb.cf.ch19.mobilecontacts;

import gr.aueb.cf.ch19.mobilecontacts.dao.IMobileContactDAO;
import gr.aueb.cf.ch19.mobilecontacts.dao.MobileContactDAOImpl;
import gr.aueb.cf.ch19.mobilecontacts.model.MobileContact;

public class Main {
    private static final IMobileContactDAO dao = new MobileContactDAOImpl();

    public static void main(String[] args) {
        MobileContact mobileContact = new MobileContact(1, "Athan.", "Androutsos", "123456789");
        MobileContact returnedContact = dao.insert(mobileContact);
    }
}
