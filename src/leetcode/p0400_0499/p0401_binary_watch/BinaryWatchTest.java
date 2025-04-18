package org.willxu.algorithm.service.strlist;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.strlist.BinaryWatchCombinations;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryWatchTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        1,
                        Stream.of(
                                "0:01", "0:02", "0:04", "0:08", "0:16", "0:32",
                                "1:00", "2:00", "4:00", "8:00"
                        ).collect(Collectors.toList())
                ),
                Arguments.arguments(
                        9,
                        Collections.emptyList()
                )
        );
    }

    @ParameterizedTest(name = "Combinations {index}")
    @MethodSource("dataProvider")
    public void testCombinations(int turnedOn, List<String> expected)
            throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String expectedString = objectMapper.writeValueAsString(expected);
        BinaryWatch combinations = new BinaryWatchCombinations();
        List<String> output = combinations.readBinaryWatch(turnedOn);
        assertEquals(expectedString, objectMapper.writeValueAsString(output));
    }

    @Test
    public void testPossible() {
        BinaryWatchCombinations combinations = new BinaryWatchCombinations();
        int sumHour = 0;
        int[] hours = new int[] {1, 2, 4, 8};
        for (int i = 0; i < hours.length; i++) {
            sumHour += combinations.getPossibleBinaryList(
                    i, 0, 0, hours, 11).size();
        }
        int sumMinute = 0;
        int[] minutes = new int[] {1, 2, 4, 8, 16, 32};
        for (int i = 0; i < minutes.length; i++) {
            sumMinute += combinations.getPossibleBinaryList(
                    i, 0, 0, minutes, 59).size();
        }
        System.out.println(sumHour + "," + sumMinute);
    }
}
