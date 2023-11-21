import java.util.HashMap;
import java.util.Map;

public class sol_5 {

    public static void main(String[] args) {
        String anagram = "OnbuOl";
        String originalString = "Least OnbuOl";

        Map<Character, Integer> originalCharacterCountMap = new HashMap<>();
        for (char c : originalString.toCharArray()) {
            if (!originalCharacterCountMap.containsKey(c)) {
                originalCharacterCountMap.put(c, 0);
            }
            originalCharacterCountMap.put(c, originalCharacterCountMap.get(c) + 1);
        }

        Map<Character, Integer> anagramCharacterCountMap = new HashMap<>();
        for (char c : anagram.toCharArray()) {
            if (!anagramCharacterCountMap.containsKey(c)) {
                anagramCharacterCountMap.put(c, 0);
            }
            anagramCharacterCountMap.put(c, anagramCharacterCountMap.get(c) + 1);
        }

        boolean canFormAnagram = true;
        for (Map.Entry<Character, Integer> entry : anagramCharacterCountMap.entrySet()) {
            Character c = entry.getKey();
            int anagramCount = entry.getValue();

            if (!originalCharacterCountMap.containsKey(c)) {
                canFormAnagram = false;
                break;
            }

            if (originalCharacterCountMap.get(c) < anagramCount) {
                canFormAnagram = false;
                break;
            }
        }

        if (canFormAnagram) {
            System.out.println("Yes, an anagram of \"OnbuOl\" can be formed using the letters of \"Least OnbuOl\" without using any letters more than once.");
        } else {
            System.out.println("No, an anagram of \"OnbuOl\" cannot be formed using the letters of \"Least OnbuOl\" without using any letters more than once.");
        }
    }
}
