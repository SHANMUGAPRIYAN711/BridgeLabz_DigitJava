import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = sc.nextInt();
        if(year < 1582){
            System.out.println("Year should be above 1582");
        }
        else if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year +" " + "is a leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
        sc.close();
    }
}
