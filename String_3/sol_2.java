public class sol_2 {

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        printDuplicatesV2(str);
    }

    static void printDuplicatesV2(String str) {
        for (char c = 'a'; c <= 'z'; c++) {
            int firstIndex = str.indexOf(c);
            int lastIndex = str.lastIndexOf(c);

            if (firstIndex != lastIndex) {
                System.out.print(c + " ");
            }
        }
    }
}
