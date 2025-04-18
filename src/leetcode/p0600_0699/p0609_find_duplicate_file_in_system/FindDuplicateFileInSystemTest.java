package leetcode.p0600_0699.p0609_find_duplicate_file_in_system;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindDuplicateFileInSystemTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        new String[] {
                                "root/a 1.txt(abcd) 2.txt(efgh)",
                                "root/c 3.txt(abcd)",
                                "root/c/d 4.txt(efgh)",
                                "root 4.txt(efgh)"
                        },
                        Stream.of(
                                Stream.of(
                                        "root/a/2.txt",
                                        "root/c/d/4.txt",
                                        "root/4.txt"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "root/a/1.txt",
                                        "root/c/3.txt"
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                Arguments.arguments(
                        new String[] {
                                "root/a 1.txt(abcd) 2.txt(efsfgh)",
                                "root/c 3.txt(abdfcd)",
                                "root/c/d 4.txt(efggdfh)"
                        },
                        Collections.emptyList()
                )
        );
    }

    @ParameterizedTest(name = "Split {index}")
    @MethodSource("dataProvider")
    public void testSplit(String[] paths, List<List<String>> expected) {
        FindDuplicateFileInSystem split = new FindDuplicateFileInSystemSplit();
        assertEquals(expected, split.findDuplicate(paths));
    }
}
