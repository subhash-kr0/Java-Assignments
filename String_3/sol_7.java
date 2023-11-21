import java.util.HashSet;
import java.util.Set;

public class sol_7 {

    public static void main(String[] args) {
        String str = "abcdefg";
        System.out.println(isUnique(str));
    }

    public static boolean isUnique(String str) {
        // Create a set to store unique characters
        Set<Character> uniqueChars = new HashSet<>();

        // Iterate over the characters in the string
        for (char c : str.toCharArray()) {
            // Check if the character is already present in the set
            if (uniqueChars.contains(c)) {
                return false;
            }

            // Add the character to the set
            uniqueChars.add(c);
        }

        return true;
    }
}
