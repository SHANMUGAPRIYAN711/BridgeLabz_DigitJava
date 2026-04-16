import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {10, 30, 20, 50, 60, 10, 20, 30};
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates =  new HashSet<>();
        for(int num : arr){
            if(!set.add(num)){
                duplicates.add(num);
            }
        }
        System.out.println("Duplicate Elements : " + duplicates);
    }
}
