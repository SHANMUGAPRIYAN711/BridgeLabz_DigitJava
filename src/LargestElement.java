public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 60, 10, 50, 20, 40, 10  , 30};
        int max1 = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max1){
                max1 = arr[i];
            }
        }
        System.out.println("Largest Element  : " + max1);
    }
}
