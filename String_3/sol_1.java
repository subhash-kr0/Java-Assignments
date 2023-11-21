public class sol_1 {

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(removeDuplicatesV2(str));
    }

    static String removeDuplicatesV2(String str) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
