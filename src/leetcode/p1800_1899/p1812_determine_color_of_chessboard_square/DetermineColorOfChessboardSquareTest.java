package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.DetermineColorOfChessboardSquareParity;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DetermineColorOfChessboardSquareTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("a1", false),
                arguments("h3", true),
                arguments("c7", false)
        );
    }

    @ParameterizedTest(name = "Parity {index}")
    @MethodSource("dataProvider")
    public void testParity(String coordinates, boolean expected) {
        DetermineColorOfChessboardSquare parity =
                new DetermineColorOfChessboardSquareParity();
        assertEquals(expected, parity.squareIsWhite(coordinates));
    }
}
