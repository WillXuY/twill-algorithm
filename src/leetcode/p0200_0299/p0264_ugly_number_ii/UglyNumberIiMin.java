package leetcode.p0200_0299.p0264_ugly_number_ii;

public class UglyNumberIiMin implements UglyNumberIi {
    @Override
    public int nthUglyNumber(int n) {
        int[] uglyArray = new int[n];
        uglyArray[0] = 1;
        int index2 = 0, index3 = 0, index5 = 0;
        int product2 = 2, product3 = 3, product5 = 5;
        for (int i = 1; i < n; i++) {
            uglyArray[i] = Math.min(Math.min(product2, product3), product5);
            if (product2 == uglyArray[i]) {
                product2 = 2 * uglyArray[++index2];
            }
            if (product3 == uglyArray[i]) {
                product3 = 3 * uglyArray[++index3];
            }
            if (product5 == uglyArray[i]) {
                product5 = 5 * uglyArray[++index5];
            }
        }
        return uglyArray[n - 1];
    }
}
