import java.util.*;

class UC3_EditContact {

    public static void edit(AddressBook book, String name) {

        Scanner sc = new Scanner(System.in);
        Contact c = book.find(name);

        if (c != null) {
            System.out.print("Enter new city: ");
            c.city = sc.next();
            System.out.println("Updated!");
        } else {
            System.out.println("Not found");
        }
    }
}