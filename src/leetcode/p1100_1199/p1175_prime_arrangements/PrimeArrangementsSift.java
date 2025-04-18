package leetcode.p1100_1199.p1175_prime_arrangements;

import java.math.BigInteger;

public class PrimeArrangementsSift implements PrimeArrangements {
    @Override
    public int numPrimeArrangements(int n) {
        boolean[] nonPrimeArray = new boolean[n + 1];
        nonPrimeArray[1] = true;
        int countNonPrime = 1;
        for (int i = 2; i * i <= n; i++) {
            for (int j = 2; j * i <= n; j++) {
                if (!nonPrimeArray[i * j]) {
                    countNonPrime++;
                }
                nonPrimeArray[i * j] = true;
            }
        }
        int countPrime = n - countNonPrime;
        BigInteger sift = factorial(
                new BigInteger(String.valueOf(countNonPrime)))
                .multiply(factorial(
                        new BigInteger(String.valueOf(countPrime))));
        BigInteger output = sift.mod(new BigInteger("1000000007"));
        return output.intValue();
    }

    public BigInteger factorial(BigInteger i) {
        BigInteger one = new BigInteger("1");
        if (i.compareTo(one) <= 0) {
            return one;
        }
        return i.multiply(factorial(i.subtract(one)));
    }
}
