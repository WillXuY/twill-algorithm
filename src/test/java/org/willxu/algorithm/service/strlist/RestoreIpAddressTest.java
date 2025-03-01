package org.willxu.algorithm.service.strlist;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.strlist.RestoreIpAddressLoop;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RestoreIpAddressTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        "25525511135",
                        Stream.of(
                                "255.255.11.135",
                                "255.255.111.35"
                        ).collect(Collectors.toList())
                ),
                arguments(
                        "0000",
                        Stream.of(
                                "0.0.0.0"
                        ).collect(Collectors.toList())
                ),
                arguments(
                        "101023",
                        Stream.of(
                                "1.0.10.23",
                                "1.0.102.3",
                                "10.1.0.23",
                                "10.10.2.3",
                                "101.0.2.3"
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String s, List<String> expected) {
        RestoreIpAddress loop = new RestoreIpAddressLoop();
        assertEquals(expected, loop.restoreIpAddresses(s));
    }
}
