package lt.eimis;

import lt.eimis.entities.Role;
import lt.eimis.entities.User;

public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        User user = new User("bob", "dylan");
        User anotherUser = new User();
        user.setFirstName("alice");
        user.setLastName("cooper");
        System.out.println(user);
        System.out.println(anotherUser);

        Role role = new Role("a", "b", 10);
        System.out.println(role);
    }
}
