package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.StudentAttendanceRecord1Loop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class StudentAttendanceRecord1Test {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("PPALLP", true),
                arguments("PPALLL", false)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String input, boolean excepted) {
        StudentAttendanceRecord1 loop = new StudentAttendanceRecord1Loop();
        assertEquals(excepted, loop.checkRecord(input));
    }
}
