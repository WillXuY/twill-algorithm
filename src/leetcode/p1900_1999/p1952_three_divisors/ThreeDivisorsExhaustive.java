package leetcode.p1900_1999.p1952_three_divisors;

public class ThreeDivisorsExhaustive implements ThreeDivisors {
    @Override
    public boolean isThree(int n) {
        int count = 2;
        for (int i = 2; i * 2 <= n; i++) {
            if (n % i == 0) {
                count++;
                if (count > 3) {
                    return false;
                }
            }
        }
        return count == 3;
    }
}
