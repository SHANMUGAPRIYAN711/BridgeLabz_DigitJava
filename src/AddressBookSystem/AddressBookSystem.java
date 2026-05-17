package AddressBookSystem;
import java.util.*;

public class AddressBookSystem {

    Map<String,
            AddressBook>

            books=

            new HashMap<>();



    public void addBook(
            String name){

        books.put(

                name,

                new AddressBook());
    }

}