/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p1500_1599.p1552_magnetic_force_between_two_balls;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MagneticForceBetweenTwoBallsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 2, 3, 4, 7}, 3, 3),
                arguments(new int[] {5, 4, 3, 2, 1, 1000000000}, 2, 999999999)
        );
    }

    @ParameterizedTest(name = "Brute force {index}")
    @MethodSource("dataProvider")
    public void testGetMagneticForceBetweenTwoBalls(int[] position, int m, int output) {
        MagneticForceBetweenTwoBallsService bruteForce = new MagneticForceBetweenTwoBallsServiceImpl();
        assertEquals(output, bruteForce.getMagneticForceBetweenTwoBalls(position, m));
    }
}
