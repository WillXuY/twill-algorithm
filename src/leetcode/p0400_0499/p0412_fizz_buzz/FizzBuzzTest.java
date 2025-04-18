package leetcode.p0400_0499.p0412_fizz_buzz;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

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
    public void testCycle(int input, List<String> expectedList)
            throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String expected = objectMapper.writeValueAsString(expectedList);
        FizzBuzz cycle = new FizzBuzzCycle();
        List<String> result = cycle.fizzBuzz(input);
        assertEquals(expected, objectMapper.writeValueAsString(result));
    }
}
