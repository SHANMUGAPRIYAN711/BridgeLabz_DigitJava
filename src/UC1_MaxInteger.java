public class UC1_MaxInteger {
    public static Integer findMax(Integer a, Integer b , Integer c){
        Integer max = a;
        if(b.compareTo(max) > 0){
            max = b;
        }
        if(c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }
    public static void main(String[] args) {
        //TC 1.1 max at first
        System.out.println(findMax(30, 20, 10));
        //Tc 1.2 max at second
        System.out.println(findMax(20, 30, 10));
        //Tc 1.3 max at third
        System.out.println(findMax(10, 20, 50));
    }
}
