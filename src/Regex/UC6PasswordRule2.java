package Regex;

public class UC6PasswordRule2 {

    public static boolean validatePassword(String password) {

        return password.matches(
                "^(?=.*[A-Z])[A-Za-z0-9@#$%^&+=]{8,}$"
        );
    }

    public static void main(String[] args) {

        System.out.println(validatePassword("Password"));
        System.out.println(validatePassword("password"));
    }
}
