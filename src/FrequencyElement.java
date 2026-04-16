import java.util.HashMap;

public class FrequencyElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 10, 20, 30, 40, 50};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num , map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);
    }
}
