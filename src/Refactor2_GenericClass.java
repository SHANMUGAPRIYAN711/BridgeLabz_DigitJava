public class Refactor2_GenericClass <T extends  Comparable<T>>{
    T a, b, c;
    Refactor2_GenericClass(T a, T b, T c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public T testMaximum(){
        return findMax(a, b, c);
    }
    public static  <T extends  Comparable<T>> T findMax(T a, T b, T c){
        T max = a;
        if(b.compareTo(max) > 0){
            max = b;
        }
        if(c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }
    public static void main(String[] args) {
        Refactor2_GenericClass <Integer> obj = new Refactor2_GenericClass<>(10, 50, 60);
        System.out.println(obj.testMaximum());
    }
}
