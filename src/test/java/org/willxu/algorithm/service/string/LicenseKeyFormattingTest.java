package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.LicenseKeyFormattingLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LicenseKeyFormattingTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("5F3Z-2e-9-w", 4, "5F3Z-2E9W"),
                arguments("2-5g-3-J", 2, "2-5G-3J")
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String input, int length, String expected) {
        LicenseKeyFormatting loop = new LicenseKeyFormattingLoop();
        assertEquals(expected, loop.licenseKeyFormatting(input, length));
    }
}
