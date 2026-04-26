public class UC3_MaxString {
    public static String findMax(String a, String b , String c){
        String max = a;
        if(b.compareTo(max) > 0){
            max = b;
        }
        if(c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(findMax("Apple", "Banna", "Peach"));
        System.out.println(findMax("Dog", "Cat", "Elephant"));
        System.out.println(findMax("Zebra", "Lion", "Tiger"));
    }
}
