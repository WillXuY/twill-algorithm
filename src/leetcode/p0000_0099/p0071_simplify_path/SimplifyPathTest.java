package leetcode.p0000_0099.p0071_simplify_path;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SimplifyPathTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("/hello../world", "/hello../world"),
                arguments("/.", "/"),
                arguments("/..a/", "/..a"),
                arguments("/...", "/..."),
                arguments("/a//b////c/d//././/..", "/a/b/c"),
                arguments("/a/../../b/../c//.//", "/c"),
                arguments("/a/./b/../../c/", "/c"),
                arguments("/home/", "/home"),
                arguments("/../", "/"),
                arguments("/home//foo/", "/home/foo")
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String path, String expected) {
        SimplifyPath loop = new SimplifyPathLoop();
        assertEquals(expected, loop.simplifyPath(path));
    }
}
