/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0600_0699.p0657_robot_return_to_origin;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RobotReturnToOriginTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("UD", true),
                arguments("LL", false),
                arguments("RRDD", false),
                arguments("LDRRLRUULR", false)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String input, boolean expected) {
        RobotReturnToOrigin count = new RobotReturnToOriginCount();
        assertEquals(expected, count.judgeCircle(input));
    }
}
