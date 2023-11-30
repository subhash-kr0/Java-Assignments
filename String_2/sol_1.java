import java.util.Scanner;

public class sol_1{
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter something: ");

        // Read user input as a string
        String userInput = scanner.nextLine();

        // Display the user's input
        System.out.println("You entered: " + userInput);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
