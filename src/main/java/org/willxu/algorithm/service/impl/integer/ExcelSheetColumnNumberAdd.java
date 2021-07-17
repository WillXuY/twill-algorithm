package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.ExcelSheetColumnNumber;

public class ExcelSheetColumnNumberAdd implements ExcelSheetColumnNumber {
    @Override
    public int titleToNumber(String columnTitle) {
        char[] chars = columnTitle.toCharArray();
        int number = 0;
        int base = 26;
        for (char c: chars) {
            number = number * base + (c - 'A' + 1);
        }
        return number;
    }
}
