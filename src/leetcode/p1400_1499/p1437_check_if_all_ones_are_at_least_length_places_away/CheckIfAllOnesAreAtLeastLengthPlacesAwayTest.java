package leetcode.p1400_1499.p1437_check_if_all_ones_are_at_least_length_places_away;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckIfAllOnesAreAtLeastLengthPlacesAwayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 0, 0, 0, 1, 0, 0, 1}, 2, true),
                arguments(new int[] {1, 0, 0, 1, 0, 1}, 2, false)
        );
    }

    @ParameterizedTest(name = "Min {index}")
    @MethodSource("dataProvider")
    public void testMin(int[] nums, int k, boolean expected) {
        CheckIfAllOnesAreAtLeastLengthPlacesAway min =
                new CheckIfAllOnesAreAtLeastLengthPlacesAwayMin();
        assertEquals(expected, min.kLengthApart(nums, k));
    }
}
