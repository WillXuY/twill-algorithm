package leetcode.p2200_2299.p2299_strong_password_checker_ii;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

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
    public void testLoop(String password, boolean expected) {
        StrongPasswordCheckerIi loop = new StrongPasswordCheckerIiLoop();
        assertEquals(expected, loop.strongPasswordCheckerII(password));
    }
}
