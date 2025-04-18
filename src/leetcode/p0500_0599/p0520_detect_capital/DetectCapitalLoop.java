package leetcode.p0500_0599.p0520_detect_capital;

public class DetectCapitalLoop implements DetectCapital {
    @Override
    public boolean detectCapitalUse(String word) {
        if (word.length() < 2) {
            return true;
        }
        char[] chars = word.toCharArray();
        boolean followCapital = chars[0] > ('A' - 1) && chars[0] < ('Z' + 1);
        boolean secondCapital = chars[1] > ('A' - 1) && chars[1] < ('Z' + 1);
        if (!followCapital && secondCapital) {
            return false;
        } else {
            followCapital = secondCapital;
        }
        for (int i = 2; i < chars.length; i++) {
            boolean capital = chars[i] > ('A' - 1) && chars[i] < ('Z' + 1);
            if (followCapital ^ capital) {
                return false;
            }
        }
        return true;
    }
}
