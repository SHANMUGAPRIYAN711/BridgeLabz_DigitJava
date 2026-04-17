import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int year = sc.nextInt();
        if(year < 1582){
            System.out.println("Year should be above 1582");
        }
        if(year < 1000  || year > 9999){
            System.out.println("Enter four digit number");
            return;
        }
        else if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year +" "+"Leap Year");
        }
        else{
            System.out.println("Not a leap year");
        }
        sc.close();
    }
}
