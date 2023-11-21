import java.util.Scanner;

public class sol_4{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string = scanner.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;
        int specialCharacterCount = 0;

        for (char c : string.toCharArray()) {
            if (isVowel(c)) {
                vowelCount++;
            } else if (isConsonant(c)) {
                consonantCount++;
            } else {
                specialCharacterCount++;
            }
        }

        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
        System.out.println("Special Characters: " + specialCharacterCount);
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    private static boolean isConsonant(char c) {
        return "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ".indexOf(c) != -1;
    }
}
