package leetcode.p2100_2199.p2114_maximum_number_of_words_found_in_sentences;

public class MaximumNumberOfWordsFoundInSentencesSplit
        implements MaximumNumberOfWordsFoundInSentences {
    @Override
    public int mostWordsFound(String[] sentences) {
        int output = 0;
        for (String sentence: sentences) {
            String[] sub = sentence.split(" ");
            int count = 0;
            for (String s: sub) {
                if (!"".equals(s)) {
                    count++;
                }
            }
            if (count > output) {
                output = count;
            }
        }
        return output;
    }
}
