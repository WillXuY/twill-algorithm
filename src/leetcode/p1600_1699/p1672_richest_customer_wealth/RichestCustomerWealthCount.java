package leetcode.p1600_1699.p1672_richest_customer_wealth;

public class RichestCustomerWealthCount implements RichestCustomerWealth {
    @Override
    public int maximumWealth(int[][] accounts) {
        int output = Integer.MIN_VALUE;
        for (int[] a: accounts) {
            int count = 0;
            for (int i: a) {
                count += i;
            }
            if (count > output) {
                output = count;
            }
        }
        return output;
    }
}
