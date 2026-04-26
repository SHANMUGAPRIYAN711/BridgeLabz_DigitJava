public class UC2_MaxFloat {
    public static Float findmax(Float a, Float b, Float c){
        Float max = a;
        if(b.compareTo(max) > 0){
            max = b;
        }
        if(c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(findmax(10.5f, 20.5f, 5.5f));
        System.out.println(findmax(30.5f, 10.5f, 25.5f));
        System.out.println(findmax(5.5f, 15.5f, 50.5f));
    }
}
