package User_RegistrationProblem;
public class UC4MobileNumber {

    public static boolean validateMobile(String mobile) {

        return mobile.matches("^[0-9]{2}\\s[0-9]{10}$");
    }

    public static void main(String[] args) {

        System.out.println(validateMobile("91 9876543210"));
        System.out.println(validateMobile("919876543210"));
        System.out.println(validateMobile("91 98765"));
    }
}
