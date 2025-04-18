package leetcode.p2000_2099.p2073_time_needed_to_buy_tickets;

public class TimeNeededToBuyTicketsLoop implements TimeNeededToBuyTickets {
    @Override
    public int timeRequiredToBuy(int[] tickets, int k) {
        int output = 0;
        while (tickets[k] > 0) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] > 0) {
                    tickets[i]--;
                    output++;
                    if (tickets[i] == 0 && i == k) {
                        return output;
                    }
                }
            }
        }
        return 0;
    }
}
