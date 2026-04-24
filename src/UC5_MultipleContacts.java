import java.util.*;

class UC5_MultipleContacts {

    public static void run(AddressBook book) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many contacts: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Contact c = UC1_CreateContact.create();
            book.add(c);
        }

        book.display();
    }
}