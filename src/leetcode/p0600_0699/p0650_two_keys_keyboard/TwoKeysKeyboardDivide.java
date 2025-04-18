package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.TwoKeysKeyboard;

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
