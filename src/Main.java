public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        AddressBook book = new AddressBook();

        // UC1
        Contact c = UC1_CreateContact.createContact();

        // UC2
        UC2_AddContact.add(book, c);

        // UC3
        UC3_EditContact.edit(book, c.firstName);

        // UC4
        UC4_DeleteContact.delete(book, c.firstName);
    }
}