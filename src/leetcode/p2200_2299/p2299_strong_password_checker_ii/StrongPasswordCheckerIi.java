package org.willxu.algorithm.service.bool;

public interface StrongPasswordCheckerIi {
    /**
     * A password is said to be strong if it satisfies all the following
     * criteria:
     * <p>
     * - It has at least 8 characters.
     * - It contains at least one lowercase letter.
     * - It contains at least one uppercase letter.
     * - It contains at least one digit.
     * - It contains at least one special character. The special
     *   characters are the characters in the following string:
     *   "!@#$%^&*()-+".
     * - It does not contain 2 of the same character in adjacent
     *   positions (i.e., "aab" violates this condition, but "aba" does
     *   not).
     * <p>
     * Given a string password, return true if it is a strong password.
     * Otherwise, return false.
     *
     * @param password 1 <= password.length <= 100
     *                 password consists of letters, digits, and special
     *                 characters: "!@#$%^&*()-+".
     */
    boolean strongPasswordCheckerII(String password);
}
