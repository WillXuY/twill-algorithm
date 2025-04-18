package leetcode.p0500_0599.p0507_perfect_number;

public class PerfectNumberDivision implements PerfectNumber {
    @Override
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum +=i;
            }
            if (sum > num) {
                return false;
            }
        }
        return sum == num;
    }
}
