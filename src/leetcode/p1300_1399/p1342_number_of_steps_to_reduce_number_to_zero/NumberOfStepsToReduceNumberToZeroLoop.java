package leetcode.p1300_1399.p1342_number_of_steps_to_reduce_number_to_zero;

public class NumberOfStepsToReduceNumberToZeroLoop
        implements NumberOfStepsToReduceNumberToZero {
    @Override
    public int numberOfSteps(int num) {
        int output = 0;
        while (num > 0) {
            if ((num & 1) == 1) {
                num--;
            } else {
                num /= 2;
            }
            output++;
        }
        return output;
    }
}
