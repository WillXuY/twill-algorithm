package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.UniqueEmailAddressesLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class UniqueEmailAddressesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 1: Forgot add '@'.
                arguments(
                        new String[] {
                                "test.email+alex@leetcode.com",
                                "test.email.leet+alex@code.com"
                        },
                        2
                ),
                arguments(
                        new String[] {
                                "test.email+alex@leetcode.com",
                                "test.e.mail+bob.cathy@leetcode.com",
                                "testemail+david@lee.tcode.com"
                        },
                        2
                ),
                arguments(
                        new String[] {
                                "a@leetcode.com",
                                "b@leetcode.com",
                                "c@leetcode.com"
                        },
                        3
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String[] emails, int expected) {
        UniqueEmailAddresses loop = new UniqueEmailAddressesLoop();
        assertEquals(expected, loop.numUniqueEmails(emails));
    }
}
