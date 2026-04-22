import java.util.*;

class UC3_EditContact {

    public static void edit(AddressBook book, String name) {

        Scanner sc = new Scanner(System.in);
        Contact c = book.find(name);

        if (c != null) {
            System.out.print("Enter New City: ");
            c.city = sc.next();
            System.out.println("Contact Updated!");
        } else {
            System.out.println("Contact Not Found");
        }

        book.display();
    }
}