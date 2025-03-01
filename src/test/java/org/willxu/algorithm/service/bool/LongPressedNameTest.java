package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.LongPressedNameIndex;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LongPressedNameTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 3: not check the last one.
                arguments("pyplrz", "ppyypllr", false),
                // 2: check typed char same with last.
                arguments("alex", "aaleexeex", false),
                // Wrong answer1: name length > ale
                arguments("alexd", "ale", false),
                arguments("alex", "aaleex", true),
                arguments("saeed", "ssaaedd", false)
        );
    }

    @ParameterizedTest(name = "Index {index}")
    @MethodSource("dataProvider")
    public void testIndex(String name, String typed, boolean expected) {
        LongPressedName index = new LongPressedNameIndex();
        assertEquals(expected, index.isLongPressedName(name, typed));
    }
}
