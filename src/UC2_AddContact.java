class UC2_AddContact {

    public static void add(AddressBook book, Contact c) {
        book.addContact(c);
        book.display();
    }
}