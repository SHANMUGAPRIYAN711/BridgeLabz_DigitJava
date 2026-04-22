import java.util.*;

class UC1_CreateContact {

    public static Contact createContact() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String first = sc.next();

        System.out.print("Enter Last Name: ");
        String last = sc.next();

        System.out.print("Enter City: ");
        String city = sc.next();

        return new Contact(first, last, "", city, "", "", "", "");
    }
}