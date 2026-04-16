public class Staticdemo {
    static int a;
    static {
        a = 10;
    }
    static void display(){
        System.out.println("Static Method");
        System.out.println("Count Value : " + a);
    }
    public static void main(String[] args) {
        Staticdemo.display();
    }
}
