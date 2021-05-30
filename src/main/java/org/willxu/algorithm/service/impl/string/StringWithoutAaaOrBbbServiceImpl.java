package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.StringWithoutAaaOrBbbService;

public class StringWithoutAaaOrBbbServiceImpl implements StringWithoutAaaOrBbbService {
    @Override
    public String getStringWithoutAaaOrBbb(int A, int B){
        boolean isAMoreThanB = A > B;
        if (isAMoreThanB) {
            A = A ^ B;
            B = A ^ B;
            A = A ^ B;
        }
        if (A == 0) {
            String result = isAMoreThanB ? "a":"b";
            if (B == 0) {
                return "";
            } else if (B == 1) {
                return result;
            } else if (B == 2) {
                return result + result;
            }
        }
        StringBuilder middleString = new StringBuilder();
        // the middle string: abab...ab
        middleString.append("ab".repeat(Math.max(0, A)));
        // insert b to ababab...ab
        for (int i = 0;(i < A && i < (B - A)); i++) {
            middleString.insert(3 * i, "b");
        }
        if ((B - 2 * A) > 0) {
            middleString.insert(0, "b");
            if ((B - 2 * A) > 1) {
                middleString.append("b");
            }
        }
        String result = middleString.toString();
        if (isAMoreThanB) {
            result = result.replaceAll("b", "c");
            result = result.replaceAll("a", "b");
            result = result.replaceAll("c", "a");
        }
        return result;
    }
}
