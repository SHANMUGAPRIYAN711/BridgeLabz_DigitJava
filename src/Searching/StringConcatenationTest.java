package Searching;

public class StringConcatenationTest {

    public static void main(String[] args) {

        int n = 10000;

        // String
        long start1 = System.nanoTime();

        String str = "";

        for (int i = 0; i < n; i++) {
            str += "a";
        }

        long end1 = System.nanoTime();

        System.out.println("String Time: "
                + (end1 - start1));

        // StringBuilder
        long start2 = System.nanoTime();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append("a");
        }

        long end2 = System.nanoTime();

        System.out.println("StringBuilder Time: "
                + (end2 - start2));

        // StringBuffer
        long start3 = System.nanoTime();

        StringBuffer sf = new StringBuffer();

        for (int i = 0; i < n; i++) {
            sf.append("a");
        }

        long end3 = System.nanoTime();

        System.out.println("StringBuffer Time: "
                + (end3 - start3));
    }
}