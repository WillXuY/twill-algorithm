package leetcode.p2100_2199.p2108_find_first_palindromic_string_in_the_array;

public interface FindFirstPalindromicStringInTheArray {
    /**
     * Given an array of strings words, return the first palindromic
     * string in the array. If there is no such string, return an empty
     * string "".
     * <p>
     * A string is palindromic if it reads the same forward and
     * backward.
     *
     * @param words 1 <= words.length <= 100
     *              1 <= words[i].length <= 100
     *              words[i] consists only of lowercase English letters.
     */
     String firstPalindrome(String[] words);
}
