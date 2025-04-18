package leetcode.p2200_2299.p2220_minimum_bit_flips_to_convert_number;

public class MinimumBitFlipsToConvertNumberBit
        implements MinimumBitFlipsToConvertNumber {
    @Override
    public int minBitFlips(int start, int goal) {
        int output = 0;
        while (start > 0 || goal > 0) {
            output += (start % 2) ^ (goal % 2);
            start /= 2;
            goal /= 2;
        }
        return output;
    }
}
