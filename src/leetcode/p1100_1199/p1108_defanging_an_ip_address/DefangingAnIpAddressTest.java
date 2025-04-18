package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.DefangingAnIpAddressRegex;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DefangingAnIpAddressTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("1.1.1.1", "1[.]1[.]1[.]1"),
                arguments("255.100.50.0", "255[.]100[.]50[.]0")
        );
    }

    @ParameterizedTest(name = "Regex {index}")
    @MethodSource("dataProvider")
    public void testRegex(String address, String expected) {
        DefangingAnIpAddress regex = new DefangingAnIpAddressRegex();
        assertEquals(expected, regex.defangIPaddr(address));
    }
}
