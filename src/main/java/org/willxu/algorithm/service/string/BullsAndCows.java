package org.willxu.algorithm.service.string;

public interface BullsAndCows {
    /**
     * You are playing the Bulls and Cows game with your friend.
     * <p>
     * You write down a secret number and ask your friend to guess what
     * the number is. When your friend makes a guess, you provide a hint
     * with the following info:
     * <p>
     * - The number of "bulls", which are digits in the guess that are in
     *   the correct position.
     * <p>
     * - The number of "cows", which are digits in the guess that are in
     *   your secret number but are located in the wrong position.
     *   Specifically, the non-bull digits in the guess that could be
     *   rearranged such that they become bulls.
     * <p>
     * Given the secret number secret and your friend's guess guess,
     * return the hint for your friend's guess.
     * <p>
     * The hint should be formatted as "xAyB", where x is the number of
     * bulls and y is the number of cows. Note that both secret and
     * guess may contain duplicate digits.
     *
     * @param secret,guess 1 <= secret.length, guess.length <= 1000
     *                     secret.length == guess.length
     *                     secret and guess consist of digits only.
     */
    String getHint(String secret, String guess);
}
