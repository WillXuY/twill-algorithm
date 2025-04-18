package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.CheckIfAllAsAppearsBeforeAllBs;

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
