package Regex;

public class UC8PasswordRule4 {

    public static boolean validatePassword(String password) {

        return password.matches(
                "^(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)[A-Za-z0-9@#$%^&+=]{8,}$"
        );
    }

    public static void main(String[] args) {

        System.out.println(validatePassword("Password@1"));
        System.out.println(validatePassword("Password@@1"));
    }
}