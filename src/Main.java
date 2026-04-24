public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        AddressBook book = new AddressBook();

        // UC1
        Contact contact = UC1_CreateContact.create();

        // UC2
        UC2_AddContact.add(book, contact);

        // UC3
        UC3_EditContact.edit(book, contact.firstName);

        // UC4
        UC4_DeleteContact.delete(book, contact.firstName);

        // UC5
        UC5_MultipleContacts.run(book);

        // UC6
        UC6_MultipleAddressBook.run();
    }
}