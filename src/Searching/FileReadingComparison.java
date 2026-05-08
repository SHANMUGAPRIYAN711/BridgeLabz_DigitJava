package Searching;

import java.io.*;

public class FileReadingComparison {

    public static void main(String[] args) throws Exception {

        // FileReader
        long start1 = System.nanoTime();

        FileReader fr = new FileReader("sample.txt");

        while (fr.read() != -1) {
        }

        fr.close();

        long end1 = System.nanoTime();

        System.out.println("FileReader Time: "
                + (end1 - start1));

        // InputStreamReader
        long start2 = System.nanoTime();

        InputStreamReader isr =
                new InputStreamReader(
                        new FileInputStream("sample.txt"));

        while (isr.read() != -1) {
        }

        isr.close();

        long end2 = System.nanoTime();

        System.out.println("InputStreamReader Time: "
                + (end2 - start2));
    }
}