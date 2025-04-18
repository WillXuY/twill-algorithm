package leetcode.p2400_2499.p2409_count_days_spent_together;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountDaysSpentTogetherTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("08-15", "08-18", "08-16", "08-19", 3),
                arguments("10-01", "10-31", "11-01", "12-31", 0)
        );
    }

    @ParameterizedTest(name = "Add {index}")
    @MethodSource("dataProvider")
    public void testAdd(String arriveAlice, String leaveAlice,
                        String arriveBob, String leaveBob, int expected) {
        CountDaysSpentTogether add = new CountDaysSpentTogetherAdd();
        assertEquals(expected, add.countDaysTogether(
                arriveAlice, leaveAlice, arriveBob, leaveBob));
    }
}
