public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = { 40, 20, 30,50, 60, 10};
        int min = arr[0];
        for(int num : arr){
            if(num < min){
                min = num;
            }
        }
        if(arr.length == 0) System.out.println("Array is Empty");
        System.out.println(min);
    }
}
