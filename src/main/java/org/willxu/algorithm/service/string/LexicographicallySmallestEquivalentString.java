package org.willxu.algorithm.service.string;

public interface LexicographicallySmallestEquivalentString {
    /**
     * You are given two strings of the same length s1 and s2 and a
     * string baseStr.
     * <p>
     * We say s1[i] and s2[i] are equivalent characters.
     * <p>
     * - For example, if s1 = "abc" and s2 = "cde", then we have
     *   'a' == 'c', 'b' == 'd', and 'c' == 'e'.
     * <p>
     * Equivalent characters follow the usual rules of any equivalence
     * relation:
     * <p>
     * - Reflexivity: 'a' == 'a'.
     * - Symmetry: 'a' == 'b' implies 'b' == 'a'.
     * - Transitivity: 'a' == 'b' and 'b' == 'c' implies 'a' == 'c'.
     * <p>
     * For example, given the equivalency information from s1 = "abc"
     * and s2 = "cde", "acd" and "aab" are equivalent strings of
     * baseStr = "eed", and "aab" is the lexicographically smallest
     * equivalent string of baseStr.
     * <p>
     * Return the lexicographically smallest equivalent string of
     * baseStr by using the equivalency information from s1 and s2.
     *
     * @param s1,s2 1 <= s1.length, s2.length, baseStr <= 1000
     *              s1.length == s2.length
     *              consist of lowercase English letters.
     * @param baseStr consist of lowercase English letters.
     */
    String smallestEquivalentString(String s1, String s2, String baseStr);
}
