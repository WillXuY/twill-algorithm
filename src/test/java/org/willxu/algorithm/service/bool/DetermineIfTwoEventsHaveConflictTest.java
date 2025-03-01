package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.DetermineIfTwoEventsHaveConflictCompare;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DetermineIfTwoEventsHaveConflictTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new String[] {"01:15", "02:00"},
                        new String[] {"02:00", "03:00"},
                        true
                ),
                arguments(
                        new String[] {"01:00", "02:00"},
                        new String[] {"01:20", "03:00"},
                        true
                ),
                arguments(
                        new String[] {"10:00", "11:00"},
                        new String[] {"14:00", "15:00"},
                        false
                )
        );
    }

    @ParameterizedTest(name = "dataProvider")
    @MethodSource("dataProvider")
    public void testCompare(
            String[] event1, String[] event2, boolean expected) {
        DetermineIfTwoEventsHaveConflict compare =
                new DetermineIfTwoEventsHaveConflictCompare();
        assertEquals(expected, compare.haveConflict(event1, event2));
    }
}
