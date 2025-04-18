package leetcode.p2000_2099.p2073_time_needed_to_buy_tickets;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TimeNeededToBuyTicketsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {2, 3, 2}, 2, 6),
                arguments(new int[] {5, 1, 1, 1}, 0, 8)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] tickets, int k, int expected) {
        TimeNeededToBuyTickets loop = new TimeNeededToBuyTicketsLoop();
        assertEquals(expected, loop.timeRequiredToBuy(tickets, k));
    }
}
