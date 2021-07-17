package org.willxu.algorithm.service.integer;

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
