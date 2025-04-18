package leetcode.p1400_1499.p1446_consecutive_characters;

public class ConsecutiveCharactersLoop implements ConsecutiveCharacters {
    @Override
    public int maxPower(String s) {
        char[] chars = s.toCharArray();
        char lastChar = chars[0];
        int subLength = 1;
        int maxSubLength = 1;
        for (int i = 1; i < chars.length; i++) {
            char c = chars[i];
            if (lastChar == c) {
                subLength++;
            } else {
                maxSubLength = Math.max(maxSubLength, subLength);
                subLength = 1;
                lastChar = c;
            }
        }
        return Math.max(maxSubLength, subLength);
    }
}
