package Regex;

public class UC5PasswordRule1 {

    public static boolean validatePassword(String password) {

        return password.matches("^[A-Za-z0-9@#$%^&+=]{8,}$");
    }

    public static void main(String[] args) {

        System.out.println(validatePassword("Password"));
        System.out.println(validatePassword("Pass"));
    }
}
