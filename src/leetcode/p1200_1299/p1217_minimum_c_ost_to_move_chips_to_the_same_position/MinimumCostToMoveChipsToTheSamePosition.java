package leetcode.p1200_1299.p1217_minimum_c_ost_to_move_chips_to_the_same_position;

public interface MinimumCostToMoveChipsToTheSamePosition {
    /**
     * We have n chips, where the position of the i^th chip is
     * position[i].
     * We need to move all the chips to the same position. In one step,
     * we can change the position of the i^th chip from position[i] to:
     * - position[i] + 2 or position[i] - 2 with cost = 0.
     * - position[i] + 1 or position[i] - 1 with cost = 1.
     * Return the minimum cost needed to move all the chips to the same
     * position.
     *
     * @param position 1 <= position.length <= 100
     *                 1 <= position[i] <= 10^9
     * @return min cost to move chips to one place.
     */
    int minCostToMoveChips(int[] position);
}
