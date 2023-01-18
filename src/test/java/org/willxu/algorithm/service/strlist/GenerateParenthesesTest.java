package org.willxu.algorithm.service.strlist;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.strlist.GenerateParenthesesLoop;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class GenerateParenthesesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        4,
                        Stream.of(new String[] {
                                "(((())))","((()()))","((())())","((()))()",
                                "(()(()))","(()()())","(()())()","(())(())",
                                "(())()()","()((()))","()(()())","()(())()",
                                "()()(())","()()()()"
                        }).collect(Collectors.toList())
                ),
                arguments(
                        3,
                        Stream.of(new String[] {
                                "((()))", "(()())", "(())()", "()(())", "()()()"
                        }).collect(Collectors.toList())
                ),
                arguments(1, Stream.of("()").collect(Collectors.toList()))
        );
    }

    @ParameterizedTest(name = "Exchange {index}")
    @MethodSource("dataProvider")
    public void testExchange(int n, List<String> excepted) {
        GenerateParentheses exchange = new GenerateParenthesesLoop();
        assertArrayEquals(excepted.toArray(),
                exchange.generateParenthesis(n).toArray());

    }
}
