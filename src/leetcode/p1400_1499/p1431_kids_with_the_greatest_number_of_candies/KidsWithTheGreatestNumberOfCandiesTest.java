package leetcode.p1400_1499.p1431_kids_with_the_greatest_number_of_candies;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class KidsWithTheGreatestNumberOfCandiesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {2, 3, 5, 1, 3}, 3,
                        Stream.of(
                                true, true, true, false, true
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new int[] {4, 2, 1, 1, 2}, 1,
                        Stream.of(
                                true, false, false, false, false
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new int[] {12, 1, 12}, 10,
                        Stream.of(
                                true, false, true
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Max {index}")
    @MethodSource("dataProvider")
    public void testMax(
            int[] candies, int extraCandies, List<Boolean> expected) {
        KidsWithTheGreatestNumberOfCandies max =
                new KidsWithTheGreatestNumberOfCandiesMax();
        assertArrayEquals(expected.toArray(),
                max.kidsWithCandies(candies, extraCandies).toArray());
    }
}
