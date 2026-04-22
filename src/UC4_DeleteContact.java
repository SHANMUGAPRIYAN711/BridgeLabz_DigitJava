class UC4_DeleteContact {

    public static void delete(AddressBook book, String name) {
        book.delete(name);
        book.display();
    }
}