package leetcode.p1300_1399.p1389_create_target_array_in_the_given_order;

public class CreateTargetArrayInTheGivenOrderCopy
        implements CreateTargetArrayInTheGivenOrder{
    @Override
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] output = new int[index.length];
        for (int i = 0; i < index.length; i++) {
            int insert = index[i];
            int value = nums[i];
            System.arraycopy(output, insert, output, insert + 1, i - insert);
            output[insert] = value;
        }
        return output;
    }
}
