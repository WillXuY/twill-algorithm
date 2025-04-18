package leetcode.p1100_1199.p1189_maximum_number_of_balloons;

public class MaximumNumberOfBalloonsCount implements MaximumNumberOfBalloons {
    /**
     * Balloon:
     *   1 x b, 1 x a, 2 x l, 2 x o, 1 x n.
     * int[] balons = new int[5].
     *
     * @param text 1 <= text.length <= 10^4
     *             consists of lowercase English letters only.
     * @return min number of ba l/2 o/2 n.
     */
    @Override
    public int maxNumberOfBalloons(String text) {
        int[] balons = new int[5];
        for (char c: text.toCharArray()) {
            if ('b' == c) {
                balons[0]++;
            } else if ('a' == c) {
                balons[1]++;
            } else if ('l' == c) {
                balons[2]++;
            } else if ('o' == c) {
                balons[3]++;
            } else if ('n' == c) {
                balons[4]++;
            }
        }
        int output = balons[0];
        for (int i = 1; i < balons.length; i++) {
            int count = balons[i];
            if (i == 2 || i == 3) {
                count /= 2;
            }
            output = Math.min(output, count);
        }
        return output;
    }
}
