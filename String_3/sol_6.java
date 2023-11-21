import java.util.HashSet;
import java.util.Set;

public class sol_6{

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(str));
    }

    public static boolean isPangram(String str) {
        // Create a Set to store the unique characters
        Set<Character> uniqueChars = new HashSet<>();

        // Convert the string to lowercase to ignore case sensitivity
        str = str.toLowerCase();

        // Iterate over the characters in the string
        for (char c : str.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(c)) {
                // Add the character to the Set
                uniqueChars.add(c);
            }
        }

        // Check if the Set contains all 26 letters of the English alphabet
        return uniqueChars.size() == 26;
    }
}
