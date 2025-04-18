package leetcode.p1100_1199.p1128_number_of_equivalent_domino_pairs;

public interface NumberOfEquivalentDominoPairs {
    /**
     * Given a list of dominoes, dominoes[i] = [a, b] is equivalent to
     * dominoes[j] = [c, d] if and only if either (a == c and b == d),
     * or (a == d and b == c) - that is, one domino can be rotated to be
     * equal to another domino.
     * Return the number of pairs (i, j) for which 0 <= i < j <
     * dominoes.length, and dominoes[i] is equivalent to dominoes[j].
     *
     * @param dominoes 1 <= dominoes.length <= 4 * 10^4
     *                 dominoes[i].length == 2
     *                 1 <= dominoes[i][j] <= 9
     * @return number of pairs.
     */
    int numEquivDominoPairs(int[][] dominoes);
}
