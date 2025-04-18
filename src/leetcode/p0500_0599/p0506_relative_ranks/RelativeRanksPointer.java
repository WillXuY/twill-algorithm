package leetcode.p0500_0599.p0506_relative_ranks;

public class RelativeRanksPointer implements RelativeRanks {
    @Override
    public String[] findRelativeRanks(int[] score) {
        int[] order = new int[score.length];
        for (int i = 1; i < score.length; i++) {
            int smallerThan = 0;
            for (int j = 0; j < i; j++) {
                if (score[i] > score[j]) {
                    order[j] = order[j] + 1;
                } else {
                    smallerThan++;
                }
            }
            order[i] = smallerThan;
        }
        String[] output = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            switch (order[i]) {
                case 0 -> output[i] = "Gold Medal";
                case 1 -> output[i] = "Silver Medal";
                case 2 -> output[i] = "Bronze Medal";
                default -> output[i] = String.valueOf(order[i] + 1);
            }
        }
        return output;
    }
}
