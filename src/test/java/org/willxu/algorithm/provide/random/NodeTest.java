package org.willxu.algorithm.provide.random;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NodeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        Node.generateByList(
                                Stream.of(
                                        Stream.of(
                                                7, null
                                        ).collect(Collectors.toList()),
                                        Stream.of(
                                                13, 0
                                        ).collect(Collectors.toList()),
                                        Stream.of(
                                                11, 4
                                        ).collect(Collectors.toList()),
                                        Stream.of(
                                                10, 2
                                        ).collect(Collectors.toList()),
                                        Stream.of(
                                                1, 0
                                        ).collect(Collectors.toList())
                                ).collect(Collectors.toList())
                        )
                )
        );
    }

    @ParameterizedTest(name = "Generate By List {index}")
    @MethodSource("dataProvider")
    public void testGenerateByList(Node head) {
        assertEquals(7, head.val);
    }
}
