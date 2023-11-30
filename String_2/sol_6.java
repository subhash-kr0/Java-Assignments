public class sol_6 {
    public static void main(String[] args) {
        // Example string
        String word = "umbrella";

        // Check if 'e' is present in the string
        boolean isPresent = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'e') {
                isPresent = true;
                break;
            }
        }

        // Display the result
        if (isPresent) {
            System.out.println("'e' is present in the string.");
        } else {
            System.out.println("'e' is not present in the string.");
        }
    }
}
