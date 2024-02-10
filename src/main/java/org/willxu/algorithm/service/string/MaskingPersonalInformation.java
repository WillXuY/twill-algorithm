package org.willxu.algorithm.service.string;

public interface MaskingPersonalInformation {
    /**
     * You are given a personal information string s, representing
     * either an email address or a phone number. Return the masked
     * personal information using the below rules.
     * <p>
     * Email address:
     * <p>
     * An email address is:
     * <p>
     * - A name consisting of uppercase and lowercase English letters,
     *   followed by
     * - The '@' symbol, followed by
     * - The domain consisting of uppercase and lowercase English letters
     *   with a dot '.' somewhere in the middle (not the first or last
     *   character).
     * <p>
     * To mask an email:
     * <p>
     * - The uppercase letters in the name and domain must be converted
     *   to lowercase letters.
     * - The middle letters of the name (i.e., all but the first and
     *   last letters) must be replaced by 5 asterisks "*****".
     * <p>
     * Phone number:
     * <p>
     * A phone number is formatted as follows:
     * <p>
     * - The phone number contains 10-13 digits.
     * - The last 10 digits make up the local number.
     * - The remaining 0-3 digits, in the beginning, make up the country
     *   code.
     * - Separation characters from the set {'+', '-', '(', ')', ' '}
     *   separate the above digits in some way.
     * <p>
     * To mask a phone number:
     * <p>
     * - Remove all separation characters.
     * - The masked phone number should have the form:
     *   - "***-***-XXXX" if the country code has 0 digits.
     *   - "+*-***-***-XXXX" if the country code has 1 digit.
     *   - "+**-***-***-XXXX" if the country code has 2 digits.
     *   - "+***-***-***-XXXX" if the country code has 3 digits.
     * - "XXXX" is the last 4 digits of the local number.
     *
     * @param s is either a valid email or a phone number.
     *          If s is an email:
     *          - 8 <= s.length <= 40
     *          - s consists of uppercase and lowercase English letters
     *            and exactly one '@' symbol and '.' symbol.
     *          If s is a phone number:
     *          - 10 <= s.length <= 20
     *          - s consists of digits, spaces, and the symbols
     *            '(', ')', '-', and '+'.
     */
    String maskPII(String s);
}
