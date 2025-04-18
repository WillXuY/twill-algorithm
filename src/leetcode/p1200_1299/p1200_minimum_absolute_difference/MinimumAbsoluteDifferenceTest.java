package leetcode.p1200_1299.p1200_minimum_absolute_difference;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumAbsoluteDifferenceTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {4, 2, 1, 3},
                        Stream.of(
                                Stream.of(1, 2).collect(Collectors.toList()),
                                Stream.of(2, 3).collect(Collectors.toList()),
                                Stream.of(3, 4).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new int[] {1, 3, 6, 10, 15},
                        Stream.of(
                                Stream.of(1, 3).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new int[] {3, 8, -10, 23, 19, -4, -14, 27},
                        Stream.of(
                                Stream.of(
                                        -14, -10
                                ).collect(Collectors.toList()),
                                Stream.of(19, 23).collect(Collectors.toList()),
                                Stream.of(23, 27).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Sort {index}")
    @MethodSource("dataProvider")
    public void testSort(int[] arr, List<List<Integer>> expected)
            throws JsonProcessingException {
        MinimumAbsoluteDifference sort = new MinimumAbsoluteDifferenceSort();
        List<List<Integer>> output = sort.minimumAbsDifference(arr);
        ObjectMapper objectMapper = new ObjectMapper();
        String except = objectMapper.writeValueAsString(expected);
        assertEquals(except, objectMapper.writeValueAsString(output));
    }
}
