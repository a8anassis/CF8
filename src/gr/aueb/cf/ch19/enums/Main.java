package gr.aueb.cf.ch19.enums;

public class Main {

    public static void main(String[] args) {
        UserRole role = UserRole.STUDENT;
        String strRole = role.name();   // toString() -> "STUDENT"
        System.out.println(strRole);
        UserRole studentRole = UserRole.valueOf(strRole);
    }
}
