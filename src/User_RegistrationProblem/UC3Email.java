package User_RegistrationProblem;

public class UC3Email {

    public static boolean validateEmail(String email) {

        return email.matches(
                "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$"
        );
    }

    public static void main(String[] args) {

        System.out.println(validateEmail("abc@yahoo.com"));
        System.out.println(validateEmail("abc@gmail.com"));
        System.out.println(validateEmail("abc@.com"));
    }
}
