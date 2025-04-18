package leetcode.p1900_1999.p1935_maximum_number_of_words_you_can_type;

public class MaximumNumberOfWordsYouCanTypeSplit
        implements MaximumNumberOfWordsYouCanType {
    @Override
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int output = 0;
        for (String word: words) {
            char[] chars = word.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (brokenLetters.contains(String.valueOf(chars[i]))) {
                    break;
                }
                if (i == chars.length - 1) {
                    output++;
                }
            }
        }
        return output;
    }
}
