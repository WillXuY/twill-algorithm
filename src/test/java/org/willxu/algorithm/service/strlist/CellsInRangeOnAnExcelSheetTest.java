package org.willxu.algorithm.service.strlist;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.strlist.CellsInRangeOnAnExcelSheetLoop;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CellsInRangeOnAnExcelSheetTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        "K1:L2",
                        Stream.of(
                                "K1", "K2", "L1", "L2"
                        ).collect(Collectors.toList())
                ),
                arguments(
                        "A1:F1",
                        Stream.of(
                                "A1","B1","C1","D1","E1","F1"
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String s, List<String> expected) {
        CellsInRangeOnAnExcelSheet loop = new CellsInRangeOnAnExcelSheetLoop();
        assertArrayEquals(expected.toArray(), loop.cellsInRange(s).toArray());
    }
}
