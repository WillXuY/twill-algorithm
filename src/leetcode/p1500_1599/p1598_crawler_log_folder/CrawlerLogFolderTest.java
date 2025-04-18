package leetcode.p1500_1599.p1598_crawler_log_folder;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

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
    public void testLoop(String[] logs, int expected) {
        CrawlerLogFolder loop = new CrawlerLogFolderLoop();
        assertEquals(expected, loop.minOperations(logs));
    }
}
