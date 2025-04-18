package leetcode.p0000_0099.p0040_combination_sum_ii;

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

public class CombinationSumIiTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {10, 1, 2, 7, 6, 1, 5}, 8,
                        Stream.of(
                                Stream.of(
                                        1, 1, 6
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        1, 2, 5
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        1, 7
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        2, 6
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new int[] {2, 5, 2, 1, 2}, 5,
                        Stream.of(
                                Stream.of(
                                        1, 2, 2
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        5
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(int[] candidates, int target,
                        List<List<Integer>> expected)
            throws JsonProcessingException {
            CombinationSumIi map = new CombinationSumIiMap();
            ObjectMapper objectMapper = new ObjectMapper();
            String output = objectMapper.writeValueAsString(
                    map.combinationSum2(candidates, target));
            assertEquals(objectMapper.writeValueAsString(expected), output);
    }

    /**
     * Time out
     */
    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(int[] candidates, int target,
                              List<List<Integer>> expected)
            throws JsonProcessingException {
        CombinationSumIi recursive = new CombinationSumIiRecursive();
        ObjectMapper objectMapper = new ObjectMapper();
        String output = objectMapper.writeValueAsString(
                recursive.combinationSum2(candidates, target));
        assertEquals(objectMapper.writeValueAsString(expected), output);
    }
}
