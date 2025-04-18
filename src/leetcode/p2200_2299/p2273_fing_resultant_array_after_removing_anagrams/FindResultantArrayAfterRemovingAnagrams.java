package leetcode.p2200_2299.p2273_fing_resultant_array_after_removing_anagrams;

import java.util.List;

public interface FindResultantArrayAfterRemovingAnagrams {
    /**
     * You are given a 0-indexed string array words, where words[i]
     * consists of lowercase English letters.
     * <p>
     * In one operation, select any index i such that
     * 0 < i < words.length and words[i - 1] and words[i] are anagrams,
     * and delete words[i] from words. Keep performing this operation as
     * long as you can select an index that satisfies the conditions.
     * <p>
     * Return words after performing all operations. It can be shown
     * that selecting the indices for each operation in any arbitrary
     * order will lead to the same result.
     * <p>
     * An Anagram is a word or phrase formed by rearranging the letters
     * of a different word or phrase using all the original letters
     * exactly once. For example, "dacb" is an anagram of "abdc".
     *
     * @param words 1 <= words.length <= 100
     *              1 <= words[i].length <= 10
     *              words[i] consists of lowercase English letters.
     */
    List<String> removeAnagrams(String[] words);
}
