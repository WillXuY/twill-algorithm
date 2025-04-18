package leetcode.p0400_0499.p0476_number_complement;

public class NumberComplementDividing implements NumberComplement {
    @Override
    public int findComplement(int num) {
        int result = 0;
        int add = 1;
        while (num > 0) {
            if (num % 2 != 1) {
                result += add;
            }
            add *= 2;
            num /= 2;
        }
        return result;
    }
}
