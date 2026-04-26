import java.util.Arrays;

public class UC4_MaxVarArgs {

    public static <T extends Comparable<T>> T findMax(T... values) {

        Arrays.sort(values);
        return values[values.length - 1];
    }

    public static void main(String[] args) {

        System.out.println(findMax(10, 20, 30, 40, 50));
        System.out.println(findMax(5.5f, 9.5f, 1.5f));
    }
}