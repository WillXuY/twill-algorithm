package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.CrawlerLogFolderLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CrawlerLogFolderTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new String[] {"d1/", "d2/", "../", "d21/", "./"}, 2),
                arguments(
                        new String[] {"d1/", "d2/", "./", "d3/", "../", "d31/"},
                        3
                ),
                arguments(new String[] {"d1/", "../", "../", "../"}, 0)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String[] logs, int excepted) {
        CrawlerLogFolder loop = new CrawlerLogFolderLoop();
        assertEquals(excepted, loop.minOperations(logs));
    }
}
