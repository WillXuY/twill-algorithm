package leetcode.p0900_0999.p0948_bag_of_tokens;

public interface BagOfTokens {
    /**
     * You start with an initial power of power, an initial score of 0,
     * and a bag of tokens given as an integer array tokens, where each
     * tokens[i] denotes the value of token_i.
     * <p>
     * Your goal is to maximize the total score by strategically playing
     * these tokens. In one move, you can play an unplayed token in one
     * of the two ways (but not both for the same token):
     * <p>
     * - Face-up: If your current power is at least tokens[i], you may
     *   play token_i, losing tokens[i] power and gaining 1 score.
     * - Face-down: If your current score is at least 1, you may plan
     *   token_i, gaining tokens[i] power and losing 1 score.
     * <p>
     * Return the maximum possible score you can achieve after playing
     * any number of tokens.
     *
     * @param tokens 0 <= tokens.length <= 1000
     *               0 <= tokens[i], power < 10^4
     * @param power 0 <= power < 10^4
     */
    int bagOfTokensScore(int[] tokens, int power);
}
