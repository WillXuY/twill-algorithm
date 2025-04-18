package leetcode.p2400_2499.p2413_smallest_even_multiple;

public class SmallestEvenMultipleAnd implements SmallestEvenMultiple {
    @Override
    public int smallestEvenMultiple(int n) {
        return (n & 1) == 0 ? n: n * 2;
    }
}
