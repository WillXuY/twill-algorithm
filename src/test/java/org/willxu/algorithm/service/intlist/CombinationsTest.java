package org.willxu.algorithm.service.intlist;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.intlist.CombinationsRecursive;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CombinationsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        4, 2,
                        Stream.of(
                                Stream.of(1, 2).collect(Collectors.toList()),
                                Stream.of(1, 3).collect(Collectors.toList()),
                                Stream.of(1, 4).collect(Collectors.toList()),
                                Stream.of(2, 3).collect(Collectors.toList()),
                                Stream.of(2, 4).collect(Collectors.toList()),
                                Stream.of(3, 4).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                arguments(
                        1, 1,
                        Stream.of(
                                Stream.of(1).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(int n, int k, List<List<Integer>> excepted)
            throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Combinations recursive = new CombinationsRecursive();
        String output = objectMapper.writeValueAsString(
                recursive.combine(n, k));
        assertEquals(objectMapper.writeValueAsString(excepted), output);
    }
}
