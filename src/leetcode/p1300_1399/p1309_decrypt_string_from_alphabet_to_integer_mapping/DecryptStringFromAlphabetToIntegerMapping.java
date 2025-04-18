package leetcode.p1300_1399.p1309_decrypt_string_from_alphabet_to_integer_mapping;

public interface DecryptStringFromAlphabetToIntegerMapping {
    /**
     * You are given a string s formed by digits and '#'. We want to map
     * s to English lowercase characters as follows:
     * - Characters ('a' to 'i') are represented by ('1' to '9')
     *   respectively.
     * - Characters ('j' to 'z') are represented by ('10#' to '26#')
     *   respectively.
     * Return the string formed after mapping.
     * The test cases are generated so that a unique mapping will always
     * exist.
     *
     * @param s 1 <= s.length <= 1000
     *          consists of digits and the '#' letter.
     *          will be a valid string such that mapping is always
     *          possible.
     * @return the string formed after mapping.
     */
    String freqAlphabets(String s);
}
