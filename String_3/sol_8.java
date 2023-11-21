import java.util.HashMap;
import java.util.Map;

public class sol_8 {

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        Map<Character, Integer> charCounts = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (charCounts.containsKey(c)) {
                charCounts.put(c, charCounts.get(c) + 1);
            } else {
                charCounts.put(c, 1);
            }
        }

        char maxOccurringChar = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxOccurringChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("The maximum occurring character is: " + maxOccurringChar);
        System.out.println("The maximum occurrence count is: " + maxCount);
    }
}
