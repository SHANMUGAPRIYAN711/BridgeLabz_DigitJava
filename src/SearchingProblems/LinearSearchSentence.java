package SearchingProblems;

public class LinearSearchSentence {

    public static String searchSentence(String[] sentences,
                                        String word) {

        for (String sentence : sentences) {

            if (sentence.contains(word)) {
                return sentence;
            }
        }

        return "Not Found";
    }

    public static void main(String[] args) {

        String[] sentences = {
                "Java is powerful",
                "Python is easy",
                "Binary search is fast"
        };

        String result =
                searchSentence(sentences, "Binary");

        System.out.println(result);
    }
}
