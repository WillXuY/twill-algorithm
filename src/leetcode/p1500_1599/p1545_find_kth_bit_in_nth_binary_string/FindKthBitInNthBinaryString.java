package leetcode.p1500_1599.p1545_find_kth_bit_in_nth_binary_string;

public interface FindKthBitInNthBinaryString {
	/**
	 * Given two positive integers n and k, the binary string S_n is
	 * formed as follows:
	 * <p>
	 * - S_1 = "0"
	 * - S_i = S_i - 1 + "1" + reverse(invert(S_i - 1)) for i > 1
	 * <p>
	 * Where + denotes the concatenation operation, reverse(x) returns
	 * the reversed string x, and invert(x) inverts all the bits in x
	 * (0 changes to 1 and 1 changes to 0).
	 * <p>
	 * For example, the first four strings in the above sequence are:
	 * <p>
	 * - S_1 = "0"
	 * - S_2 = "011"
	 * - S_3 = "0111001"
	 * - S_4 = "011100110110001"
	 * <p>
	 * Return the k^th bit in S_n. It is guaranteed that k is valid for
	 * the given n.
	 * 
	 * @param n 1 <= n <= 20
	 * @param k 1 <= k <= 2^n - 1
	 */
	char findKthBit(int n, int k);
}
