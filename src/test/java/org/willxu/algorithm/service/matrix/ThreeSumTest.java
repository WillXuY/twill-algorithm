package org.willxu.algorithm.service.matrix;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.matrix.ThreeSumPointer;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ThreeSumTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {-1, 0, 1, 2, -1, -4},
                        Stream.of(
                                Stream.of(
                                        -1, -1, 2
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        -1, 0, 1
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                arguments(new int[] {0, 1, 1}, Collections.emptyList()),
                arguments(
                        new int[] {0, 0, 0},
                        Stream.of(
                                Stream.of(
                                        0, 0, 0
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Pointer {index}")
    @MethodSource("dataProvider")
    public void testPointer(int[] nums, List<List<Integer>> expected)
            throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        ThreeSum pointer = new ThreeSumPointer();
        String output = objectMapper.writeValueAsString(pointer.threeSum(nums));
        assertEquals(objectMapper.writeValueAsString(expected), output);
    }
}
