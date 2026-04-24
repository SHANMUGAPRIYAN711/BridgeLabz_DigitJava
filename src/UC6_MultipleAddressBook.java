import java.util.*;

class UC6_MultipleAddressBook {

    public static void run() {

        Scanner sc = new Scanner(System.in);
        HashMap<String, AddressBook> map = new HashMap<>();

        System.out.print("Enter AddressBook name: ");
        String name = sc.next();

        map.put(name, new AddressBook());

        System.out.println("AddressBook Created: " + name);
    }
}