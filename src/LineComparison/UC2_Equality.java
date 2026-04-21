package LineComparison;

public class UC2_Equality {
    public static void checkEquality(double l1, double l2){
        Double length1 = l1;
        Double length2 = l2;
        if(length1.equals(length2)){
            System.out.println("Lines are Equal");
        }else{
            System.out.println("Lines are not Equal");
        }
    }
}
