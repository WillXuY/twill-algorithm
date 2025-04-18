package leetcode.p1900_1999.p1929_concatenation_of_array;

public class ConcatenationOfArrayCopy implements ConcatenationOfArray {
    @Override
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] output = new int[len * 2];
        System.arraycopy(nums, 0, output, 0, len);
        System.arraycopy(nums, 0, output, len, len);
        return output;
    }
}
