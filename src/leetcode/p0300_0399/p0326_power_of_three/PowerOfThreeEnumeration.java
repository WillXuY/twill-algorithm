package leetcode.p0300_0399.p0326_power_of_three;

public class PowerOfThreeEnumeration implements PowerOfThree {
    @Override
    public boolean isPowerOfThree(int n) {
        int[] all = new int[] {1, 3, 9, 27, 81, 243, 729, 2187, 6561, 19683,
                59049, 177147, 531441, 1594323, 4782969, 14348907, 43046721,
                129140163, 387420489, 1162261467};
        for (int i: all) {
            if (i == n) {
                return true;
            }
        }
        return false;
    }
}
