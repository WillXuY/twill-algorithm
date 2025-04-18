package leetcode.p0400_0499.p0495_teemo_attacking;

public class TeemoAttackingLoop implements TeemoAttacking {
    @Override
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (duration == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            int diff = timeSeries[i + 1] - timeSeries[i];
            count += Math.min(diff, duration);
        }
        return count + duration;
    }
}
