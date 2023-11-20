 public class sol_1 {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 10;

        System.out.println("Input 1: number = " + number1);
        System.out.println("Output 1: " + getBinaryRepresentation(number1));

        System.out.println("Input 2: number = " + number2);
        System.out.println("Output 2: " + getBinaryRepresentation(number2));
    }

    // Function to get the binary representation of a number
    public static String getBinaryRepresentation(int number) {
        // Using Integer.toBinaryString to get the binary representation
        return Integer.toBinaryString(number);
    }
}
