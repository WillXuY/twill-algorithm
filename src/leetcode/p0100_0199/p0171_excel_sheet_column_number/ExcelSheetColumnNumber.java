/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0100_0199.p0171_excel_sheet_column_number;

public interface ExcelSheetColumnNumber {
    /**
     * Given a string columnTitle that represents the column title as
     * appear in an Excel sheet, return its corresponding column
     * number.
     *
     * For example:
     * A -> 1
     * B -> 2
     * C -> 3
     * ...
     * Z -> 26
     * AA -> 27
     * AB -> 28
     * ...
     *
     * @param columnTitle 1 <= columnTitle.length <= 7
     *                    consists only of uppercase English letters.
     *                    is in the range ["A", "FXSHRXW"].
     * @return the number of title
     */
    int titleToNumber(String columnTitle);
}
