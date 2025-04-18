package leetcode.p0300_0399.p0338_counting_bits;

public class CountingBitsCycleMulti2 implements CountingBits {
    @Override
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int cycle = 1; cycle <= n; cycle *= 2) {
            for (int j = 0; (j < cycle) && (j <= n - cycle); j++) {
                result[cycle + j] = result[j] + 1;
            }
        }
        return result;
    }
}
