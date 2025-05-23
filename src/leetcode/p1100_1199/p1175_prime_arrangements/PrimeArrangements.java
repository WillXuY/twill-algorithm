package leetcode.p1100_1199.p1175_prime_arrangements;

public interface PrimeArrangements {
    /**
     * Return the number of permutations of 1 to n so that prime numbers
     * are at prime indices (1-indexed.)
     * (Recall that an integer is prime if and only if it is greater
     * than 1, and cannot be written as a product of two positive
     * integers both smaller that it.)
     * Since the answer may be large, return the answer modulo 10^9 + 7.
     *
     * @param n 1 <= n <= 100
     * @return number of arrange
     */
    int numPrimeArrangements(int n);
}
