/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.stringlist;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.stringlist.FizzBuzzServiceImpl;
import org.willxu.algorithm.service.stringlist.FizzBuzzService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FizzBuzzServiceTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(3, Arrays.asList("1", "2", "Fizz")),
                arguments(5, Arrays.asList("1", "2", "Fizz", "4", "Buzz")),
                arguments(15, Arrays.asList("1", "2", "Fizz", "4", "Buzz",
                        "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13",
                        "14", "FizzBuzz"))
        );
    }

    @ParameterizedTest(name = "Brute force {index}")
    @MethodSource("dataProvider")
    public void testFizzBuzzBruteForce(int input, List<String> output) {
        FizzBuzzService bruteForce = new FizzBuzzServiceImpl();
        assertEquals(output, bruteForce.getFizzBuzz(input));
    }
}
