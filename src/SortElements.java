import java.util.Arrays;

public class SortElements {
    public static void main(String[] args) {
        int[] arr = {50, 30, 20, 40, 10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int minindex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minindex]){
                    minindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
        }
    }
}
