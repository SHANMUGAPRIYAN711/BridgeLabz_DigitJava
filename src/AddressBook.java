import java.util.*;

class AddressBook {

    ArrayList<Contact> contacts = new ArrayList<>();

    public void add(Contact c) {
        contacts.add(c);
    }

    public Contact find(String name) {
        for (Contact c : contacts) {
            if (c.firstName.equals(name)) return c;
        }
        return null;
    }

    public void delete(String name) {
        contacts.removeIf(c -> c.firstName.equals(name));
    }

    public void display() {
        for (Contact c : contacts) c.display();
    }
}