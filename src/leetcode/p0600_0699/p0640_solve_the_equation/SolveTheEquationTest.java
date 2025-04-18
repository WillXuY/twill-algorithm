package leetcode.p0600_0699.p0640_solve_the_equation;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class SolveTheEquationTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments("x+5-3+x=6+x-2", "x=2"),
                Arguments.arguments("x=x", "Infinite solutions"),
                Arguments.arguments("2x=x", "x=0")
        );
    }
}
