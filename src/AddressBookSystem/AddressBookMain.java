package AddressBookSystem;
public class AddressBookMain {

    public static void main(
            String[] args){

        AddressBook book =
                new AddressBook();



        Contact c1=

                new Contact(

                        "Shan",

                        "Priyan",

                        "abc",

                        "Chennai",

                        "TamilNadu",

                        "600001",

                        "999999",

                        "a@gmail.com");



        Contact c2=

                new Contact(

                        "Ram",

                        "Kumar",

                        "xyz",

                        "Madurai",

                        "TamilNadu",

                        "600002",

                        "88888",

                        "b@gmail.com");



        Contact c3=

                new Contact(

                        "Shan",

                        "Priyan",

                        "abc",

                        "Chennai",

                        "TamilNadu",

                        "600001",

                        "999999",

                        "a@gmail.com");



        book.addContact(c1);

        book.addContact(c2);

        book.addContact(c3);



        System.out.println(

                book.searchByCity(
                        "Chennai"));



        System.out.println(

                book.countCity(
                        "Chennai"));



        book.sortByName();

        book.sortByCity();

        book.sortByState();

        book.sortByZip();

    }

}