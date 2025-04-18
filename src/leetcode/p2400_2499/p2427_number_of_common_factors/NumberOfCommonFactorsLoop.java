package leetcode.p2400_2499.p2427_number_of_common_factors;

public class NumberOfCommonFactorsLoop implements NumberOfCommonFactors {
    @Override
    public int commonFactors(int a, int b) {
        int max = a, min = b;
        if (a < b) {
            max = b;
            min = a;
        }
        int output = 0;
        for (int i = 1; i <= min; i++) {
            if (min % i == 0 && max % i == 0) {
                output++;
            }
        }
        return output;
    }
}
