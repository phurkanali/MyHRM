import java.util.logging.Logger;

public class Reverse_Sentence {
    public static void main(String[] args) {
        String word = "today is awesome day!!!";
        String word1 = "";
        String reverse2 = "";
        Logger LOGGER = Logger.getLogger(Reverse_Sentence.class.getName());
        String reverse[] = word.split(" ");
        for (int i = reverse.length - 1; i >= 0; i--) {
            word1 = word1 + reverse[i] + " ";
        }
        LOGGER.info(word1);
        for (int j = 0; j <= reverse.length - 1; j++) {
            String word2 = reverse[j];
            for (int k = word2.length() - 1; k >= 0; k--) {
                reverse2 = reverse2 + word2.charAt(k);
            }
            LOGGER.info(reverse2);
        }
    }
}
