package leetcode.p2300_2399.p2399_check_distance_between_same_letters;

import java.util.Arrays;

public class CheckDistanceBetweenSameLettersLoop
        implements CheckDistanceBetweenSameLetters {
    @Override
    public boolean checkDistances(String s, int[] distance) {
        int[] check = new int[distance.length];
        Arrays.fill(check, -1);
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int index = chars[i] - 'a';
            if (check[index] >= 0) {
                check[index] = i - check[index] - 1;
            } else {
                check[index] = i;
            }
        }
        for (int i = 0; i < distance.length; i++) {
            if (check[i] >= 0 && distance[i] != check[i]) {
                return false;
            }
        }
        return true;
    }
}
