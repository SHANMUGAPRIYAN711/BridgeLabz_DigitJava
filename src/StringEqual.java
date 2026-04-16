import java.util.*;

public class StringEqual {
    public static void main(String[] args) {
        String s1 = new String ("Programming");
        String s2 = new String("Programming");
        if(s1 == s2){
            System.out.println("Its Equal");
        }
        else {
            System.out.println("Not Equal");
        }
        if(s1.equals(s2)){
            System.out.println("Its Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}
