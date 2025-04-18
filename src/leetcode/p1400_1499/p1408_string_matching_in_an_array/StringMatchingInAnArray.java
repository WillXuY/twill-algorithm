package leetcode.p1400_1499.p1408_string_matching_in_an_array;

import java.util.List;

public interface StringMatchingInAnArray {
    /**
     * Given an array of string words. Return all strings in words which
     * is substring of another word in any order.
     * String words[i] is substring of words[j], if can be obtained
     * removing some characters to left and/or right side of words[j].
     *
     * @param words 1 <= words.length <= 100
     *              1 <= words[i].length <= 30
     *              words[i] contains only lowercase English letters.
     *              It's guaranteed that words[i] will be unique.
     * @return substring list in words.
     */
    List<String> stringMatching(String[] words);
}
