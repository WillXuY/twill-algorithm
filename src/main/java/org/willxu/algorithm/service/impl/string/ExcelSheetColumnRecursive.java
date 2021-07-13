package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.ExcelSheetColumnTitle;

public class ExcelSheetColumnRecursive implements ExcelSheetColumnTitle {

    @Override
    public String convertToTitle(int columnNumber) {
        int base = 26;
        if (columnNumber >= 1 && columnNumber <= 26) {
            return String.valueOf((char) ('A' + columnNumber - 1));
        }
        // last one is Z
        if (columnNumber % base == 0) {
            columnNumber -= base;
            return convertToTitle(columnNumber / base) + "Z";
        }
        int remainder = columnNumber % base;
        int quotient = columnNumber / base;
        return convertToTitle(quotient) + (char) ('A' + remainder - 1);
    }
}
