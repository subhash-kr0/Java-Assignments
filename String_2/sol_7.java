public class sol_7 {
    public static void main(String[] args) {
        // Example string
        String inputString = "Hello, have a good day";

        // Remove consonants from the string
        String resultString = removeConsonants(inputString);

        // Display the result
        System.out.println("Original string: " + inputString);
        System.out.println("String after removing consonants: " + resultString);
    }

    private static String removeConsonants(String input) {
        // Use regex to replace all consonants with an empty string
        return input.replaceAll("[^aeiouAEIOU ]", "");
    }
}
