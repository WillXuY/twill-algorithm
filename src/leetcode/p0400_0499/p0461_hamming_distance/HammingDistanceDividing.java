package leetcode.p0400_0499.p0461_hamming_distance;

public class HammingDistanceDividing implements HammingDistance {
    @Override
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int count = 0;
        while (xor > 0) {
            if (xor % 2 == 1) {
                count++;
            }
            xor /= 2;
        }
        return count;
    }
}
