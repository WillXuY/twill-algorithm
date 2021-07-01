package org.willxu.algorithm.service.matrix;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.matrix.PascalsTriangleLevel;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PascalsTriangleTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(5, Stream.of(
                        Stream.of(
                                1
                        ).collect(Collectors.toList()),
                        Stream.of(
                                1, 1
                        ).collect(Collectors.toList()),
                        Stream.of(
                                1, 2, 1
                        ).collect(Collectors.toList()),
                        Stream.of(
                                1, 3, 3, 1
                        ).collect(Collectors.toList()),
                        Stream.of(
                                1, 4, 6, 4, 1
                        ).collect(Collectors.toList())
                ).collect(Collectors.toList())),
                arguments(1, Stream.of(
                        Stream.of(
                                1
                        ).collect(Collectors.toList())
                ).collect(Collectors.toList()))
        );
    }

    @ParameterizedTest(name = "Level {index}")
    @MethodSource("dataProvider")
    public void testLevel(int input, List<List<Integer>> excepted)
            throws JsonProcessingException {
        PascalsTriangle level = new PascalsTriangleLevel();
        ObjectMapper mapper = new ObjectMapper();
        String output = mapper.writeValueAsString(level.generate(input));
        assertEquals(mapper.writeValueAsString(excepted), output);
    }
}
