package leetcode.p1800_1899.p1816_truncate_sentence;

public class TruncateSentenceCount implements TruncateSentence {
    @Override
    public String truncateSentence(String s, int k) {
        StringBuilder output = new StringBuilder();
        int countWords = 1;
        for (char c: s.toCharArray()) {
            if (c == ' ') {
                countWords++;
                if (countWords > k) {
                    break;
                }
            }
            output.append(c);
        }
        return output.toString();
    }
}
