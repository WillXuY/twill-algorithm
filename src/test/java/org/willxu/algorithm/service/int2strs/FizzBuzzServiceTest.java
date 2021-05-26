package org.willxu.algorithm.service.int2strs;

import org.willxu.algorithm.service.impl.int2strs.FizzBuzzServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.List;


public class FizzBuzzServiceTest {
    private final FizzBuzzService fizzBuzzService = new FizzBuzzServiceImpl();

    @Test
    public void testFizzBuzzBruteForce() {
        int n = 15;
        List<String> result = fizzBuzzService.getFizzBuzz(n);
        System.out.println(result);
    }
}
