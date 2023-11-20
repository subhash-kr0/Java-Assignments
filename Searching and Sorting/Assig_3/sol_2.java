public class sol_2{
    public static void main(String[] args) {
        int n1 = 15;
        int n2 = 32;

        System.out.println("Input 1: n = " + n1);
        System.out.println("Output 1: " + isPowerOfTwo(n1));

        System.out.println("Input 2: n = " + n2);
        System.out.println("Output 2: " + isPowerOfTwo(n2));
    }

    // Function to check if a number is a power of two
    public static boolean isPowerOfTwo(int n) {
        // A number is a power of two if it has only one set bit (binary representation has only one '1')
        return (n > 0) && ((n & (n - 1)) == 0);
    }
}
