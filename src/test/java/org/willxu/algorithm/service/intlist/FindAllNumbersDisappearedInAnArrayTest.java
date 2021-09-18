package org.willxu.algorithm.service.intlist;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.intlist.FindAllNumbersDisappearedInAnArrayCycle;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindAllNumbersDisappearedInAnArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {4, 3, 2, 7, 8, 2, 3, 1},
                        Stream.of(5, 6).collect(Collectors.toList())
                ),
                arguments(
                        new int[] {1, 1},
                        Stream.of(2).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Cycle {index}")
    @MethodSource("dataProvider")
    public void testCycle(int[] input, List<Integer> excepted)
            throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String exceptedString = objectMapper.writeValueAsString(excepted);
        FindAllNumbersDisappearedInAnArray cycle =
                new FindAllNumbersDisappearedInAnArrayCycle();
        List<Integer> output = cycle.findDisappearedNumbers(input);
        String outputString = objectMapper.writeValueAsString(output);
        assertEquals(exceptedString, outputString);
    }
}
