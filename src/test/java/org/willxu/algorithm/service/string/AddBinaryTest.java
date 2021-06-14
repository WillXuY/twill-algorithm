package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.AddBinaryBruteForce;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class AddBinaryTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("11", "1", "100"),
                arguments("1010", "1011", "10101")
        );
    }

    @ParameterizedTest(name = "Param {index}")
    @MethodSource("dataProvider")
    public void testAddBinary(String a, String b, String output) {
        AddBinary bruteForce = new AddBinaryBruteForce();
        assertEquals(output, bruteForce.addBinary(a, b));
    }
}
