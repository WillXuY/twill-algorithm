package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.DeleteColumnsToMakeSortedLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DeleteColumnsToMakeSortedTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /*
                c  b  a
                d  a  f
                g  h  i
                delete the column 1.
                 */
                arguments(new String[] {"cba", "daf", "ghi"}, 1),
                // ordered
                arguments(new String[] {"a", "b"}, 0),
                arguments(new String[] {"zyx", "wvu", "tsr"}, 3)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String[] strs, int excepted) {
        DeleteColumnsToMakeSorted loop = new DeleteColumnsToMakeSortedLoop();
        assertEquals(excepted, loop.minDeletionSize(strs));
    }
}
