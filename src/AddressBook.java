import java.util.*;

class AddressBook {
    ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(Contact c) {
        contacts.add(c);
        System.out.println("Contact Added!");
    }

    public void display() {
        for (Contact c : contacts) {
            c.display();
        }
    }

    public Contact find(String name) {
        for (Contact c : contacts) {
            if (c.firstName.equals(name)) return c;
        }
        return null;
    }

    public void delete(String name) {
        contacts.removeIf(c -> c.firstName.equals(name));
        System.out.println("Contact Deleted!");
    }
}