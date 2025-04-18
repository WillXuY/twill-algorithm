package leetcode.p1500_1599.p1550_three_consecutive_odds;

public class ThreeConsecutiveOddsCount implements ThreeConsecutiveOdds {
    @Override
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int a: arr) {
            if ((a & 1) == 1) {
                count++;
                if (count >= 3) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }
}
