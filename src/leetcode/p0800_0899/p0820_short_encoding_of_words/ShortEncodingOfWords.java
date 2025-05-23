package leetcode.p0800_0899.p0820_short_encoding_of_words;

public interface ShortEncodingOfWords {
    /**
     * A valid encoding of an array of words is any reference string s
     * and array of indices indices such that:
     * <p>
     * - words.length == indices.length
     * - The reference string s ends with the '#' character.
     * - For each index indices[i], the substring of s starting from
     *   indices[i] and up to (but not including) the next '#' character
     *   is equal to words[i].
     * <p>
     * Given an array of words, return the length of the shortest
     * reference string s possible of any valid encoding of words.
     *
     * @param words 1 <= words.length <= 2000
     *              1 <= words[i].length <= 7
     *              words[i] consists of only lowercase letters.
     */
    int minimumLengthEncoding(String[] words);
}
