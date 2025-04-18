package leetcode.p2300_2399.p2335_minimum_amount_of_time_to_fill_cups;

public class MinimumAmountOfTimeToFillCupsDivide
        implements MinimumAmountOfTimeToFillCups {
    @Override
    public int fillCups(int[] amount) {
        int first = 0, second = 0, third = 0;
        for (int a: amount) {
            if (a > first) {
                third = second;
                second = first;
                first = a;
            } else if (a > second) {
                third = second;
                second = a;
            } else {
                third = a;
            }
        }
        if (first >= second + third) {
            return first;
        }
        // 7, 9, 4
        int output = first - second;
        third -= output;
        // 7, 7, 2
        first = second;
        int divide = third / 2;
        int remainder = third & 1;
        // 5, 5, 0
        output += divide + remainder + first;
        return output;
    }
}
