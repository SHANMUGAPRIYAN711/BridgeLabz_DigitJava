import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character : ");
        char ch = sc.next().charAt(0);
        if(ch < 'a' || ch > 'z'){
            System.out.println("Invalid Input . Enter a Correct Alphabet");
        }
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println(ch + " Its a Vowel");
        }else{
            System.out.println(ch + " Its a consonant");
        }
    }
}
