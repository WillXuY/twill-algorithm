package leetcode.p1000_1099.p1071_greatest_common_divisor_of_strings;

public interface GreatestCommonDivisorOfStrings {
    /**
     * For two strings s and t, we say "t divides s" if and only if
     * s = t + ... + t (i.e., t is concatenated with itself one or more
     * times).
     * Given two strings str1 and str2, return the largest string x such
     * that x divides both str1 and str2.
     *
     * @param str1 1 <= str1.length <= 1000
     *             consist of English uppercase letters.
     * @param str2 1 <= str2.length <= 1000
     *             consist of English uppercase letters.
     * @return string divides both str1 and str2.
     */
    String gcdOfStrings(String str1, String str2);
}
