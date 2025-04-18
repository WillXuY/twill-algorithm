package org.willxu.algorithm.service.strlist;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.strlist.RepeatedDnaSequencesSet;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatedDnaSequencesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT",
                        Stream.of(
                                "AAAAACCCCC",
                                "CCCCCAAAAA"
                        ).collect(Collectors.toList())
                ),
                Arguments.arguments(
                        "AAAAAAAAAAAAA",
                        Stream.of(
                                "AAAAAAAAAA"
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(String s, List<String> expected) {
        RepeatedDnaSequences set = new RepeatedDnaSequencesSet();
        assertEquals(expected, set.findRepeatedDnaSequences(s));
    }
}
