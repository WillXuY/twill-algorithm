package leetcode.p0300_0399.p0367_valid_perfect_square;

public class ValidPerfectSquareDifference implements ValidPerfectSquare {
    /**
     * the difference is an arithmetic progression.
     * 1, 4, 9, 16, 25, ..., 2147302921, 2147395600
     * 1, 3, 5,  7,  9, ...,      92677,      92679
     *
     * @param num 1 <= num <= 2^31 - 1
     * @return is equals the last arithmetic progression.
     */
    @Override
    public boolean isPerfectSquare(int num) {
        int maxDiff = 92679;
        for (int i = 1; i <= maxDiff; i += 2) {
            num -= i;
            if (num == 0) {
                return true;
            } else if (num < 0) {
                return false;
            }
        }
        return false;
    }
}
