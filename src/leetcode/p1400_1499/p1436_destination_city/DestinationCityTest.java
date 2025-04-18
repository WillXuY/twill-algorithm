package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.DestinationCityRemove;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DestinationCityTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        Stream.of(
                                Stream.of(
                                        "London", "New York"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "New York", "Lima"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "Lima", "Sao Paulo"
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList()),
                        "Sao Paulo"
                ),
                arguments(
                        Stream.of(
                                Stream.of(
                                        "B", "C"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "D", "B"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "C", "A"
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList()),
                        "A"
                ),
                arguments(
                        Stream.of(
                                Stream.of(
                                        "A", "Z"
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList()),
                        "Z"
                )
        );
    }

    @ParameterizedTest(name = "Remove {index}")
    @MethodSource("dataProvider")
    public void testRemove(List<List<String>> paths, String expected) {
        DestinationCity remove = new DestinationCityRemove();
        assertEquals(expected, remove.destCity(paths));
    }
}
