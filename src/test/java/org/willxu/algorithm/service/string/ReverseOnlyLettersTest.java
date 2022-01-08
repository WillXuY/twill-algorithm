package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.ReverseOnlyLettersIndex;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ReverseOnlyLettersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("ab-cd", "dc-ba"),
                arguments("a-bC-dEf-ghIj", "j-Ih-gfE-dCba"),
                arguments("Test1ng-Leet=code-Q!", "Qedo1ct-eeLg=ntse-T!")
        );
    }

    @ParameterizedTest(name = "Index {index}")
    @MethodSource("dataProvider")
    public void testIndex(String s, String excepted) {
        ReverseOnlyLetters index = new ReverseOnlyLettersIndex();
        assertEquals(excepted, index.reverseOnlyLetters(s));
    }
}
