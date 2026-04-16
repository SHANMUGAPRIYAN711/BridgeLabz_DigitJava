public class SecondMax {
    public static void main(String[] args) {

        int[] arr = {10, 30, 60, 40, 50, 20};
        SecondMax.secondLargest(arr);

        int max1 = arr[0];
        int max2 = arr[1];

        // Initialize properly
        if (max1 < max2) {
            int temp = max1;
            max1 = max2;
            max2 = temp;
        }

        for (int i = 2; i < arr.length; i++) {

            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            }
            else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }

        System.out.println("Second Largest: " + max2);
    }
    public static void secondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > max){
                secondMax = max;
                max = num;
            }
            else if(num > secondMax && num != max){
                secondMax = num;
            }
        }
        System.out.println(secondMax);
    }
}