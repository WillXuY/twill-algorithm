package leetcode.p2100_2199.p2144_minimum_cost_of_buying_candies_with_discount;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumCostOfBuyingCandiesWithDiscountTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {3, 3, 3, 1}, 7),
                arguments(new int[] {1}, 1),
                arguments(new int[] {1, 2, 3}, 5),
                arguments(new int[] {6, 5, 7, 9, 2, 2}, 23),
                arguments(new int[] {5, 5}, 10)
        );
    }

    @ParameterizedTest(name = "Sort {index}")
    @MethodSource("dataProvider")
    public void testSort(int[] cost, int expected) {
        MinimumCostOfBuyingCandiesWithDiscount sort =
                new MinimumCostOfBuyingCandiesWithDiscountSort();
        assertEquals(expected, sort.minimumCost(cost));
    }
}
