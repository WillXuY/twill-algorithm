package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.StrongPasswordCheckerIiLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class StrongPasswordCheckerIiTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("IloveLe3tcode!", true),
                arguments("Me+You--IsMyDream", false),
                arguments("1aB!", false)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String password, boolean excepted) {
        StrongPasswordCheckerIi loop = new StrongPasswordCheckerIiLoop();
        assertEquals(excepted, loop.strongPasswordCheckerII(password));
    }
}
