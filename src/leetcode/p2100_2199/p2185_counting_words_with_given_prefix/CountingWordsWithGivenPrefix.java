package leetcode.p2100_2199.p2185_counting_words_with_given_prefix;

public interface CountingWordsWithGivenPrefix {
    /**
     * You are given an array of strings words and a string pref.
     * <p>
     * Return the number of strings in words that contain pref as a
     * prefix.
     * <p>
     * A prefix of a string s is any leading contiguous substring of s.
     *
     * @param words 1 <= words.length <= 100
     *              1 <= words[i].length <= 100
     *              consist of lowercase English letters.
     * @param pref 1 <= pref.length <= 100
     *             consist of lowercase English letters.
     */
    int prefixCount(String[] words, String pref);
}
