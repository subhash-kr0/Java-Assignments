import java.util.Arrays;

public class sol_4 {

    public static void main(String[] args) {
        String str = "Hello, World!";
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);
        System.out.println(sortedString);
    }
}
