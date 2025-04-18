/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0100_0199.p0168_excel_sheet_column_title;

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
