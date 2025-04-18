package leetcode.p0000_0099.p0049_group_anagrams;

import java.util.List;

public interface GroupAnagrams {
    /**
     * Given an array of strings strs, group the anagrams together. You
     * can return the answer in any order.
     * <p>
     * An Anagram is a word or phrase formed by rearranging the letters
     * of a different word or phrase, typically using all the original
     * letters exactly once.
     *
     * @param strs 1 <= strs.length <= 104
     *             0 <= strs[i].length <= 100
     *             strs[i] consists of lowercase English letters.
     */
    List<List<String>> groupAnagrams(String[] strs);
}
