class UC4_DeleteContact {

    public static void delete(AddressBook book, String name) {
        book.delete(name);
        System.out.println("Deleted!");
        book.display();
    }
}