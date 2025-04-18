package leetcode.p1400_1499.p1475_final_prices_with_special_discount_in_shop;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FinalPricesWithSpecialDiscountInShopTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {8, 4, 6, 2, 3}, new int[] {4, 2, 4, 2, 3}),
                arguments(new int[] {1, 2, 3, 4, 5}, new int[] {1, 2, 3, 4, 5}),
                arguments(new int[] {10, 1, 1, 6}, new int[] {9, 0, 1, 6})
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] prices, int[] expected) {
        FinalPricesWithSpecialDiscountInShop loop =
                new FinalPricesWithSpecialDiscountInShopLoop();
        assertArrayEquals(expected, loop.finalPrices(prices));
    }
}
