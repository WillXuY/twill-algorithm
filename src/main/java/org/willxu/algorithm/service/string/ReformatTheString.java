package org.willxu.algorithm.service.string;

public interface ReformatTheString {
    /**
     * You are given an alphanumeric string s. (Alphanumeric string is a
     * sting consisting of lowercase English letters and digits).
     * You have to find a permutation of the string where no letter is
     * followed by another letter and no digit is followed by another
     * digit. That is, no two adjacent characters have the same type.
     * Return the reformatted string or return an empty string if it is
     * impossible to reformat the string.
     *
     * @param s 1 <= s.length <= 500
     *          consists of only lowercase English letters and/or digit.
     * @return reformat s' letters and digits.
     */
    String reformat(String s);
}
