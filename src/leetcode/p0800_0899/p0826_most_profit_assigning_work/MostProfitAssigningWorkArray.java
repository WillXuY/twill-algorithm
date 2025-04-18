package leetcode.p0800_0899.p0826_most_profit_assigning_work;

public class MostProfitAssigningWorkArray implements MostProfitAssigningWork {
    @Override
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int[] maxProfits = new int[difficulty[0] + 1];
        maxProfits[difficulty[0]] = profit[0];
        for (int i = 1; i < difficulty.length; i++) {
            if (difficulty[i] >= maxProfits.length) {
                int[] newMaxProfits = new int[difficulty[i] + 1];
                System.arraycopy(maxProfits, 0,
                        newMaxProfits, 0, maxProfits.length);
                for (int j = maxProfits.length; j < difficulty[i]; j++) {
                    newMaxProfits[j] = maxProfits[maxProfits.length - 1];
                }
                newMaxProfits[difficulty[i]] = Math.max(
                        maxProfits[maxProfits.length - 1], profit[i]);
                maxProfits = newMaxProfits;
            } else {
                for (int j = difficulty[i]; j < maxProfits.length; j++) {
                    maxProfits[j] = Math.max(maxProfits[j], profit[i]);
                }
            }
        }
        int result = 0;
        for (int w: worker) {
            if (w >= maxProfits.length) {
                result += maxProfits[maxProfits.length - 1];
            } else {
                result += maxProfits[w];
            }
        }
        return result;
    }
}
