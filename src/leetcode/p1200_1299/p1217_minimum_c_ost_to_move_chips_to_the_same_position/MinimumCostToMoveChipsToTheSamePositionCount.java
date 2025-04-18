package leetcode.p1200_1299.p1217_minimum_c_ost_to_move_chips_to_the_same_position;

public class MinimumCostToMoveChipsToTheSamePositionCount
        implements MinimumCostToMoveChipsToTheSamePosition {
    @Override
    public int minCostToMoveChips(int[] position) {
        int odds = 0;
        int evens = 0;
        for (int i: position) {
            if ((i & 1) == 1) {
                odds++;
            } else {
                evens++;
            }
        }
        return Math.min(odds, evens);
    }
}
