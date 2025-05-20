package gr.aueb.cf.ch12;

public class UserMain {

    public static void main(String[] args) {

        User user = new User(1L, "george", "alexander", "george21", "G@#%676a", true);

        user.setPassword("newPasswd##");

        System.out.printf("{id: %d, username: %s, password: %s}", user.getId(), user.getUsername(), user.getPassword());
    }
}
