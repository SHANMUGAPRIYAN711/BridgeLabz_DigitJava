import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Reverse r = new Reverse();
        r.reverse(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public void reverse(int [] arr){
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
