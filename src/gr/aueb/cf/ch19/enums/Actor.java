package gr.aueb.cf.ch19.enums;

public enum Actor {
    STUDENT("ROLE_STUDENT"),
    TEACHER("ROLE_TEACHER");

    private final String role;

    Actor(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
