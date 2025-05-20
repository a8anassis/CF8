package gr.aueb.cf.ch12;

/**
 * Very simple data class.
 * private fields, Default Constructor και
 * getters και setters με convention
 * ονομάζονται JavaBean.
 */
public class Student {
    private int id;
    private String firstname;
    private String lastname;

    public Student() {

    }

    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
