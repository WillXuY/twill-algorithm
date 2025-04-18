package leetcode.p2100_2199.p2124_check_if_all_as_appears_before_all_bs;

public class CheckIfAllAsAppearsBeforeAllBsLoop
        implements CheckIfAllAsAppearsBeforeAllBs {
    @Override
    public boolean checkString(String s) {
        boolean bAppears = false;
        for (char c: s.toCharArray()) {
            if (c == 'a') {
                if (bAppears) {
                    return false;
                }
            } else {
                bAppears = true;
            }
        }
        return true;
    }
}
