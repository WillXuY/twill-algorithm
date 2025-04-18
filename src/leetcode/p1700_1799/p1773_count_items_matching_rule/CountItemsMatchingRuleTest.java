package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.CountItemsMatchingRuleLoop;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountItemsMatchingRuleTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        Stream.of(
                                Stream.of(
                                        "phone", "blue", "pixel"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "computer", "silver", "lenovo"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "phone", "gold", "iphone"
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList()),
                        "color",
                        "silver",
                        1
                ),
                arguments(
                        Stream.of(
                                Stream.of(
                                        "phone", "blue", "pixel"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "computer", "silver", "lenovo"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "phone", "gold", "iphone"
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList()),
                        "type",
                        "phone",
                        2
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(List<List<String>> items, String ruleKey,
                         String ruleValue, int expected) {
        CountItemsMatchingRule loop = new CountItemsMatchingRuleLoop();
        assertEquals(expected, loop.countMatches(items, ruleKey, ruleValue));
    }
}
