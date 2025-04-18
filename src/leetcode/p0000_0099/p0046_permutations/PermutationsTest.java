package org.willxu.algorithm.service.intlist;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.intlist.PermutationsRecursive;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PermutationsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {1, 2, 3},
                        Stream.of(
                                Stream.of(
                                        1, 2, 3
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        1, 3, 2
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        2, 1, 3
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        2, 3, 1
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        3, 1, 2
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        3, 2, 1
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new int[] {0, 1},
                        Stream.of(
                                Stream.of(0, 1).collect(Collectors.toList()),
                                Stream.of(1, 0).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new int[] {1},
                        Stream.of(
                                Stream.of(1).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(int[] nums, List<List<Integer>> expected)
            throws JsonProcessingException {
        Permutations recursive = new PermutationsRecursive();
        ObjectMapper objectMapper = new ObjectMapper();
        String output = objectMapper.writeValueAsString(
                recursive.permute(nums));
        assertEquals(objectMapper.writeValueAsString(expected), output);
    }
}
