package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.XorOperationInAnArray;

public class XorOperationInAnArrayLoop implements XorOperationInAnArray {
    @Override
    public int xorOperation(int n, int start) {
        int output = start;
        for (int i = 1; i < n; i++) {
            start += 2;
            output = output ^ start;
        }
        return output;
    }
}
