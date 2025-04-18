package leetcode.p2100_2199.p2114_maximum_number_of_words_found_in_sentences;

public interface MaximumNumberOfWordsFoundInSentences {
    /**
     * A sentence is a list of words that are separated by a single
     * space with no leading or trailing spaces.
     * <p>
     * You are given an array of strings sentences, where each
     * sentences[i] represents a single sentence.
     * <p>
     * Return the maximum number of words that appear in a single
     * sentence.
     *
     * @param sentences 1 <= sentences.length <= 100
     *                  1 <= sentences[i].length <= 100
     *                  sentences[i] consists only of lowercase English
     *                  letters and ' ' only.
     *                  sentences[i] does not have leading or trailing
     *                  spaces.
     *                  All the words in sentences[i] are separated by
     *                  a single space.
     */
    int mostWordsFound(String[] sentences);
}
