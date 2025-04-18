package leetcode.p0800_0899.p0888_fair_candy_swap;

public interface FairCandySwap {
    /**
     * Alice and Bob have a different total number of candies. You are
     * given two integer arrays aliceSizes and bobSizes where
     * aliceSizes[i] is the number of candies of the i^th box of candy
     * that Alice has and bobSizes[j] is the number of candies of the
     * j^th box of candy that Bob has.
     * Since they are friends, they would like to exchange one candy box
     * each so that after the exchange, they both have the same total
     * amount of candy. The total amount of candy a person has is the
     * sum of the number of candies in each box they have.
     * Return an integer array answer where answer[0] is the number of
     * candies in the box that Alice must exchange, and answer[1] is the
     * number of candies in the box that Bob must exchange. If there are
     * multiple answers, you may return any one of them. It is
     * guaranteed that at least one answer exists.
     * Constraints:
     * Alice and Bob have a different total number of candies.
     * There will be at least one valid answer for the given input.
     *
     * @param aliceSizes 1 <= aliceSizes.length <= 10^4
     *                   1 <= aliceSizes[i] <= 10^5
     * @param bobSizes 1 <= bobSizes.length <= 10^4
     *                 1 <= bobSizes[i] <= 10^5
     * @return alice's candies number of box, bob's number of candies.
     */
    int[] fairCandySwap(int[] aliceSizes, int[] bobSizes);
}
