package com.willxu.algorithm.service.integer2integer;

import com.willxu.algorithm.service.impl.integer2integer.NthTribonacciNumberRecursiveImpl;
import com.willxu.algorithm.service.impl.integer2integer.NthTribonacciNumberServiceImpl;
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
