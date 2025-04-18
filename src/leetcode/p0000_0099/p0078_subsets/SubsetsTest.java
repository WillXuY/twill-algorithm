package leetcode.p0000_0099.p0078_subsets;

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

public class SubsetsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {1, 2, 3},
                        Stream.of(
                                Collections.emptyList(),
                                Stream.of(1).collect(Collectors.toList()),
                                Stream.of(1, 2).collect(Collectors.toList()),
                                Stream.of(1, 2, 3).collect(Collectors.toList()),
                                Stream.of(1, 3).collect(Collectors.toList()),
                                Stream.of(2).collect(Collectors.toList()),
                                Stream.of(2, 3).collect(Collectors.toList()),
                                Stream.of(3).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new int[] {0},
                        Stream.of(
                                Collections.emptyList(),
                                Stream.of(0).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(int[] nums, List<List<Integer>> expected)
            throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Subsets recursive = new SubsetsRecursive();
        String output = objectMapper.writeValueAsString(
                recursive.subsets(nums));
        assertEquals(objectMapper.writeValueAsString(expected), output);
    }
}
