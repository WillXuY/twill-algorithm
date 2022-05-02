package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.ReformatDateMap;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ReformatDateTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("20th Oct 2052", "2052-10-20"),
                arguments("6th Jun 1933", "1933-06-06"),
                arguments("26th May 1960", "1960-05-26")
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(String date, String excepted) {
        ReformatDate map = new ReformatDateMap();
        assertEquals(excepted, map.reformatDate(date));
    }
}
