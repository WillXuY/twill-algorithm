package leetcode.p2100_2199.p2185_counting_words_with_given_prefix;

public class CountingWordsWithGivenPrefixRegex
        implements CountingWordsWithGivenPrefix {
    @Override
    public int prefixCount(String[] words, String pref) {
        String regex = "^" + pref;
        int output = 0;
        for (String w: words) {
            if (!w.equals(w.replaceAll(regex, ""))) {
                output++;
            }
        }
        return output;
    }
}
