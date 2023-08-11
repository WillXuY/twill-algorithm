package org.willxu.algorithm.service.string;

public interface ReconstructOriginalDigitsFromEnglish {
    /**
     * Given a string s containing an out-of-order English
     * representation of digits 0-9, return the digits in ascending
     * order.
     *
     * @param s 1 <= s.length <= 10^5
     *          s[i] is one of the characters ["e","g","f","i","h","o",
     *          "n","s","r","u","t","w","v","x","z"].
     *          s is guaranteed to be valid.
     */
    String originalDigits(String s);
}
