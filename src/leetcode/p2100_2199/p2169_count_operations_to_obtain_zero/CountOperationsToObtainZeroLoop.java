package leetcode.p2100_2199.p2169_count_operations_to_obtain_zero;

public class CountOperationsToObtainZeroLoop
        implements CountOperationsToObtainZero {
    @Override
    public int countOperations(int num1, int num2) {
        int output = 0;
        while (num1 != 0 && num2 != 0) {
            int diff = Math.abs(num1 - num2);
            if (num1 > num2) {
                num1 = diff;
            } else {
                num2 = diff;
            }
            output++;
        }
        return output;
    }
}
