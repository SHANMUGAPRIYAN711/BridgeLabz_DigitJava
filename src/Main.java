public class Main {
    public static void main(String[] args) {

        System.out.println("=== HASH UC1 ===");
        UC1_WordFrequency.execute();

        System.out.println("\n=== HASH UC2 ===");
        UC2_ParagraphFrequency.execute();

        System.out.println("\n=== HASH UC3 ===");
        UC3_RemoveWord.execute();

        System.out.println("\n=== BST ===");
        BSTUseCases.execute();
    }
}