package leetcode.p1600_1699.p1678_goal_parser_interpretation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class GoalParserInterpretationTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("G()(al)", "Goal"),
                arguments("G()()()()(al)", "Gooooal"),
                arguments("(al)G(al)()()G", "alGalooG")
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String command, String expected) {
        GoalParserInterpretation loop = new GoalParserInterpretationLoop();
        assertEquals(expected, loop.interpret(command));
    }
}
