package User_RegistrationProblem;

public class UC1FirstName {

    public static boolean validateFirstName(String firstName) {

        return firstName.matches("^[A-Z][a-z]{2,}$");
    }

    public static void main(String[] args) {

        System.out.println(validateFirstName("Shan"));
        System.out.println(validateFirstName("sham"));
        System.out.println(validateFirstName("Pr"));
    }
}