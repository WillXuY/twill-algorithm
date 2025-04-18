package leetcode.p0900_0999.p0948_bag_of_tokens;

import java.util.Arrays;

public class BagOfTokensSort implements BagOfTokens {
    @Override
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0;
        int left = 0, right = tokens.length - 1;
        while (left <= right) {
            if (power >= tokens[left]) {
                power -= tokens[left];
                score++;
                left++;
                continue;
            }
            // power < tokens[left].
            if (score == 0 || left == right) {
                break;
            }
            // score - 1 and get the largest token not toked.
            score--;
            power += tokens[right];
            right--;
        }
        return score;
    }
}
