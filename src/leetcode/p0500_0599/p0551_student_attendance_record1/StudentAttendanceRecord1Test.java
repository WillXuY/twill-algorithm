package leetcode.p0500_0599.p0551_student_attendance_record1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

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
    public void testLoop(String input, boolean expected) {
        StudentAttendanceRecord1 loop = new StudentAttendanceRecord1Loop();
        assertEquals(expected, loop.checkRecord(input));
    }
}
