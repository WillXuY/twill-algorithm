package org.willxu.algorithm.service.int2int;

import org.willxu.algorithm.service.impl.int2int.NthTribonacciNumberRecursiveImpl;
import org.willxu.algorithm.service.impl.int2int.NthTribonacciNumberServiceImpl;
import org.junit.jupiter.api.Test;

public class NthTribonacciNumberTest {
    private final NthTribonacciNumberService bruteForce = new NthTribonacciNumberServiceImpl();
    private final NthTribonacciNumberService recursive = new NthTribonacciNumberRecursiveImpl();

    @Test
    public void testGetNthTribonacciNumberBruteForce() {
        int n = 4;
        int result = bruteForce.getNthTribonacciNumber(n);
        System.out.println(result);
    }

    @Test
    public void testGetNthTribonacciNumberRecursive() {
        int n = 4;
        int result = recursive.getNthTribonacciNumber(n);
        System.out.println(result);
    }

}
