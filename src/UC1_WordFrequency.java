public class UC1_WordFrequency {
    public static void execute() {

        String sentence = "To be or not to be";
        String[] words = sentence.toLowerCase().split(" ");

        MyHashMap<String, Integer> map = new MyHashMap<>();

        for (String word : words) {
            Integer count = map.get(word);
            if (count == null)
                map.put(word, 1);
            else
                map.put(word, count + 1);
        }

        map.display();
    }
}