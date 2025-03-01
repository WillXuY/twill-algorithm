package org.willxu.algorithm.service.empty;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.empty.ReverseStringExchange;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ReverseStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new char[] {'h', 'e', 'l', 'l', 'o'},
                        new char[] {'o', 'l', 'l', 'e', 'h'}
                ),
                arguments(
                        new char[] {'H', 'a', 'n', 'n', 'a', 'h'},
                        new char[] {'h', 'a', 'n', 'n', 'a', 'H'}
                )
        );
    }

    @ParameterizedTest(name = "Exchange {index}")
    @MethodSource("dataProvider")
    public void testExchange(char[] input, char[] expected) {
        ReverseString exchange = new ReverseStringExchange();
        exchange.reverseString(input);
        assertArrayEquals(expected, input);
    }
}
