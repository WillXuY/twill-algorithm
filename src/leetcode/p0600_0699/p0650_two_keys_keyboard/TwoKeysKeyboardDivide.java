package leetcode.p0600_0699.p0650_two_keys_keyboard;

public class TwoKeysKeyboardDivide implements TwoKeysKeyboard {
    @Override
    public int minSteps(int n) {
        int result = 0;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                result += i;
                n /= i;
            }
        }
        return result;
    }
}
