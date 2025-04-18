package leetcode.p0000_0099.p0018_four_sum;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FourSumTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {1000000000,1000000000,1000000000,1000000000},
                        -294967296,
                        Collections.emptyList()
                ),
                arguments(
                        new int[] {1, -2, -5, -4, -3, 3, 3, 5}, -11,
                        Stream.of(
                                Stream.of(
                                        -5, -4, -3, 1
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new int[] {1, 0, -1, 0, -2, 2}, 0,
                        Stream.of(
                                Stream.of(
                                        -2, -1, 1, 2
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        -2, 0, 0, 2
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        -1, 0, 0, 1
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new int[] {2, 2, 2, 2, 2}, 8,
                        Stream.of(
                                Stream.of(
                                        2, 2, 2, 2
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int target, List<List<Integer>> expected)
            throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        FourSum loop = new FourSumLoop();
        String output = objectMapper.writeValueAsString(
                loop.fourSum(nums, target));
        assertEquals(objectMapper.writeValueAsString(expected), output);
    }
}
