package User_RegistrationProblem;

public class UC9AllEmailSamples {

    public static boolean validateEmail(String email) {

        return email.matches(
                "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$"
        );
    }

    public static void main(String[] args) {

        String[] validEmails = {
                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc.100@yahoo.com",
                "abc111@abc.com",
                "abc-100@abc.net",
                "abc.100@abc.com.au",
                "abc@1.com",
                "abc@gmail.com.com",
                "abc+100@gmail.com"
        };

        String[] invalidEmails = {
                "abc",
                "abc@.com.my",
                "abc123@gmail.a",
                "abc123@.com",
                "abc123@.com.com",
                ".abc@abc.com",
                "abc()*@gmail.com",
                "abc@%*.com",
                "abc..2002@gmail.com",
                "abc.@gmail.com",
                "abc@abc@gmail.com",
                "abc@gmail.com.1a"
        };

        System.out.println("Valid Emails:");

        for (String email : validEmails) {

            System.out.println(email + " : " + validateEmail(email));
        }

        System.out.println("\nInvalid Emails:");

        for (String email : invalidEmails) {

            System.out.println(email + " : " + validateEmail(email));
        }
    }
}