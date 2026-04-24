import java.util.*;

class UC1_CreateContact {

    public static Contact create() {

        Scanner sc = new Scanner(System.in);

        System.out.print("First Name: ");
        String first = sc.next();

        System.out.print("Last Name: ");
        String last = sc.next();

        System.out.print("City: ");
        String city = sc.next();

        return new Contact(first, last, "", city, "", "", "", "");
    }
}