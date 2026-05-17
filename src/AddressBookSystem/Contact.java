package AddressBookSystem;
import java.util.Objects;

public class Contact {

    String firstName;

    String lastName;

    String address;

    String city;

    String state;

    String zip;

    String phone;

    String email;



    public Contact(
            String firstName,
            String lastName,
            String address,
            String city,
            String state,
            String zip,
            String phone,
            String email){

        this.firstName=firstName;

        this.lastName=lastName;

        this.address=address;

        this.city=city;

        this.state=state;

        this.zip=zip;

        this.phone=phone;

        this.email=email;
    }



    @Override
    public boolean equals(Object o){

        Contact c=(Contact)o;

        return firstName.equals(
                c.firstName)

                &&

                lastName.equals(
                        c.lastName);
    }



    @Override
    public int hashCode(){

        return Objects.hash(
                firstName,
                lastName);
    }



    @Override
    public String toString(){

        return firstName+" "
                +lastName+" "
                +city+" "
                +state;
    }

}
