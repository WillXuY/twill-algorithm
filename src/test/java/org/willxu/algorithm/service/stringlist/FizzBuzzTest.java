package org.willxu.algorithm.service.stringlist;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.stringlist.FizzBuzzCycle;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        3,
                        Stream.of(
                                "1", "2", "Fizz"
                        ).collect(Collectors.toList())
                ),
                Arguments.arguments(
                        5,
                        Stream.of(
                                "1", "2", "Fizz", "4", "Buzz"
                        ).collect(Collectors.toList())
                ),
                Arguments.arguments(
                        15,
                        Stream.of(
                                "1", "2", "Fizz", "4", "Buzz", "Fizz", "7",
                                "8", "Fizz", "Buzz", "11", "Fizz", "13", "14",
                                "FizzBuzz"
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Cycle {index}")
    @MethodSource("dataProvider")
    public void testCycle(int input, List<String> exceptedList)
            throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String excepted = objectMapper.writeValueAsString(exceptedList);
        FizzBuzz cycle = new FizzBuzzCycle();
        List<String> result = cycle.fizzBuzz(input);
        assertEquals(excepted, objectMapper.writeValueAsString(result));
    }
}
