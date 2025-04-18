package leetcode.p1700_1799.p1704_determine_if_string_halves_are_alike;

public interface DetermineIfStringHalvesAreAlike {
    /**
     * You are given a string s of even length. Split this string into
     * two halves of equal lengths, and let a be the first half and b be
     * the second half.
     *
     * Two strings are alike if they have the same number of vowels
     * ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s
     * contains uppercase and lowercase letters.
     *
     * Return true if a and b are alike. Otherwise, return false.
     *
     * @param s 2 <= s.length <= 1000
     *          s.length is even.
     *          s consists of uppercase and lowercase letters.
     */
    boolean halvesAreAlike(String s);
}
