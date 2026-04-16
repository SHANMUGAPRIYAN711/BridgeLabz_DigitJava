public class ElementsOnEven {
    public static void main(String[] args) {
        int[] arr = {10, 30, 40, 50, 60, 70};
        for(int i = 1; i < arr.length; i+= 2){
            System.out.println(arr[i]);
        }
    }
}
