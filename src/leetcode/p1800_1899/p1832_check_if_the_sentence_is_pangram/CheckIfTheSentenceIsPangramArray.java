package leetcode.p1800_1899.p1832_check_if_the_sentence_is_pangram;

public class CheckIfTheSentenceIsPangramArray
        implements CheckIfTheSentenceIsPangram {
    @Override
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        boolean[] containsAscii = new boolean[26];
        for (char s: sentence.toCharArray()) {
            int index = s - 'a';
            containsAscii[index] = true;
        }
        for (boolean c: containsAscii) {
            if (!c) {
                return false;
            }
        }
        return true;
    }
}
