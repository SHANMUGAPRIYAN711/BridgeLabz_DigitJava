public class UC2_ParagraphFrequency {
    public static void execute() {

        String text = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

        String[] words = text.toLowerCase().split(" ");

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