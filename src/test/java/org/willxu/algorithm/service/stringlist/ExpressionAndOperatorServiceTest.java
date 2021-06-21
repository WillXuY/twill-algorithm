package org.willxu.algorithm.service.stringlist;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.stringlist.ExpressionAndOperatorServiceImpl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ExpressionAndOperatorServiceTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("123", 6, Arrays.asList("1*2*3", "1+2+3")),
                arguments("232", 8, Arrays.asList("2*3+2", "2+3*2")),
                arguments("105", 5, Arrays.asList("1*0+5", "10-5")),
                arguments("00", 0, Arrays.asList("0*0", "0+0", "0-0")),
                arguments("3456237490", 9191, Collections.emptyList())
        );
    }

    @ParameterizedTest(name = "Brute force {index}")
    @MethodSource("dataProvider")
    public void expressionAddOperatorBruteForce(
            String num, int target, List<String> output) {
        // TODO deal with the assert equals for list
        ExpressionAndOperatorService bruteForce =
                new ExpressionAndOperatorServiceImpl();
        assertEquals(output, bruteForce.addOperators(num, target));
    }
}
