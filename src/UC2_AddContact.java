class UC2_AddContact {

    public static void add(AddressBook book, Contact c) {
        book.add(c);
        System.out.println("Contact Added");
        book.display();
    }
}