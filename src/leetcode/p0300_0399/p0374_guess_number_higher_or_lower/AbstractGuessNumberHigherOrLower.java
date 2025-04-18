package leetcode.p0300_0399.p0374_guess_number_higher_or_lower;

public abstract class AbstractGuessNumberHigherOrLower {
    /**
     * 1 <= n <= 2^31 - 1.
     * 1 <= pick <= n.
     */
    private final int pick;

    protected AbstractGuessNumberHigherOrLower(int pick) {
        this.pick = pick;
    }

    /**
     * Forward declaration of guess API.
     *
     * @param  num   your guess
     * @return -1 if num pick is lower than the guess number
     *		   1 if num pick is higher than the guess number
     *         otherwise return 0
     */
    protected int guess(int num) {
        if (num > pick) {
            return -1;
        } else if (num < pick) {
            return 1;
        }
        return 0;
    }

    /**
     * We are playing the Guess Game. The game is as follows:
     * I pick a number from 1 to n. You have to guess which number I
     * picked.
     * Every time you guess wrong, I will tell you whether the number
     * I picked is higher or lower than your guess.
     * You call a pre-defined API int guess(int num).
     * Return the number that I picked.
     *
     * @param n 1 <= n <= 2^31 - 1.
     * @return 1 <= pick <= n.
     */
    public abstract int guessNumber(int n);
}
