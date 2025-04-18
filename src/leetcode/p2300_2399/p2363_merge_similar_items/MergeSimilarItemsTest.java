package leetcode.p2300_2399.p2363_merge_similar_items;

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

public class MergeSimilarItemsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[][] {{1, 1}, {4, 5}, {3, 8}},
                        new int[][] {{3, 1}, {1, 5}},
                        Stream.of(
                                Stream.of(1, 6).collect(Collectors.toList()),
                                Stream.of(3, 9).collect(Collectors.toList()),
                                Stream.of(4, 5).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new int[][] {{1, 1}, {3, 2}, {2, 3}},
                        new int[][] {{2, 1}, {3, 2}, {1, 3}},
                        Stream.of(
                                Stream.of(1, 4).collect(Collectors.toList()),
                                Stream.of(2, 4).collect(Collectors.toList()),
                                Stream.of(3, 4).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new int[][] {{1, 3}, {2, 2}},
                        new int[][] {{7, 1}, {2, 2}, {1, 4}},
                        Stream.of(
                                Stream.of(1, 7).collect(Collectors.toList()),
                                Stream.of(2, 4).collect(Collectors.toList()),
                                Stream.of(7, 1).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(int[][] items1, int[][] items2,
                        List<List<Integer>> expected)
            throws JsonProcessingException {
        MergeSimilarItems map = new MergeSimilarItemsMap();
        ObjectMapper objectMapper = new ObjectMapper();
        String output = objectMapper.writeValueAsString(
                map.mergeSimilarItems(items1, items2));
        assertEquals(objectMapper.writeValueAsString(expected), output);
    }
}
