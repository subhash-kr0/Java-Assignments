public class sol_3 {

    public static void main(String[] args) {
        String sentence = "Think Twice";
        StringBuilder reversedSentence = new StringBuilder();
        int punctuationIndex = -1;

        for (int i = sentence.length() - 1; i >= 0; i--) {
            char c = sentence.charAt(i);
            if (punctuationIndex == -1 ) {
                punctuationIndex = i;
            }

            if (i == punctuationIndex) {
                reversedSentence.append(c);
                punctuationIndex = -1;
            } else {
                reversedSentence.insert(0, c);
            }
        }

        System.out.println(reversedSentence);
    }

 
}
