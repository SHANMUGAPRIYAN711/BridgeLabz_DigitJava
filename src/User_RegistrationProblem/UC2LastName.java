package User_RegistrationProblem;

public class UC2LastName {

    public static boolean validateLastName(String lastName) {

        return lastName.matches("^[A-Z][a-z]{2,}$");
    }

    public static void main(String[] args) {

        System.out.println(validateLastName("Kumar"));
        System.out.println(validateLastName("kumar"));
        System.out.println(validateLastName("Ku"));
    }
}