package leetcode.p0400_0499.p0482_license_key_formatting;

public interface LicenseKeyFormatting {
    /**
     * You are given a license key represented as a string s that
     * consists of only alphanumeric characters and dashes. The string
     * is separated to n + 1 groups by n dashes. You are also given an
     * integer k.
     * We want to reformat the string s such that each group contains
     * exactly k characters, except for the first group, which could be
     * a dash inserted between two groups, and you should convert all
     * lowercase letters to uppercase.
     * Return the reformatted license key.
     *
     * @param s 1 <= s.length <= 10^5
     *          consists of English letters, digits, and dashes '-'.
     * @param k 1 <= k <= 10^4
     * @return formatting string.
     */
    String licenseKeyFormatting(String s, int k);
}
