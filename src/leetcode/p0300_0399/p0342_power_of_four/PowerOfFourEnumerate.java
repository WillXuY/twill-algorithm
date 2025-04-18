package leetcode.p0300_0399.p0342_power_of_four;

public class PowerOfFourEnumerate implements PowerOfFour {
    @Override
    public boolean isPowerOfFour(int n) {
        int[] powers = new int[] {1, 4, 16, 64, 256, 1024, 4096, 16384,
                65536, 262144, 1048576, 4194304, 16777216, 67108864,
                268435456, 1073741824};
        for (int i: powers) {
            if (n == i) {
                return true;
            }
        }
        return false;
    }
}
