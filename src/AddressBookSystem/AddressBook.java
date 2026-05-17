package AddressBookSystem;
import java.util.*;
import java.util.stream.*;

public class AddressBook {

    List<Contact> contacts =
            new ArrayList<>();



    public void addContact(
            Contact contact){

        boolean duplicate =

                contacts.stream()

                        .anyMatch(

                                c-> c.equals(
                                        contact));



        if(duplicate){

            System.out.println(
                    "Duplicate Entry");

            return;
        }


        contacts.add(contact);

    }



    public List<Contact>
    searchByCity(
            String city){

        return contacts.stream()

                .filter(

                        c-> c.city.equalsIgnoreCase(
                                city))

                .collect(
                        Collectors.toList());
    }



    public List<Contact>
    searchByState(
            String state){

        return contacts.stream()

                .filter(

                        c-> c.state.equalsIgnoreCase(
                                state))

                .collect(
                        Collectors.toList());
    }



    public long countCity(
            String city){

        return contacts.stream()

                .filter(

                        c-> c.city.equalsIgnoreCase(
                                city))

                .count();
    }



    public long countState(
            String state){

        return contacts.stream()

                .filter(

                        c-> c.state.equalsIgnoreCase(
                                state))

                .count();
    }



    public void sortByName(){

        contacts.stream()

                .sorted(

                        Comparator.comparing(
                                c-> c.firstName))

                .forEach(
                        System.out::println);
    }



    public void sortByCity(){

        contacts.stream()

                .sorted(

                        Comparator.comparing(
                                c-> c.city))

                .forEach(
                        System.out::println);
    }



    public void sortByState(){

        contacts.stream()

                .sorted(

                        Comparator.comparing(
                                c-> c.state))

                .forEach(
                        System.out::println);
    }



    public void sortByZip(){

        contacts.stream()

                .sorted(

                        Comparator.comparing(
                                c-> c.zip))

                .forEach(
                        System.out::println);
    }

}