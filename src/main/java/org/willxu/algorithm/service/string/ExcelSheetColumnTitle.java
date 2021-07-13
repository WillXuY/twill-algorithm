package org.willxu.algorithm.service.string;

public interface ExcelSheetColumnTitle {
    /**
     * Given an integer columnNumber, return its corresponding column
     * title as it appears in an Excel sheet.
     *
     * For example:
     * A -> 1
     * B -> 2
     * c -> 3
     * ...
     * z -> 26
     * AA -> 27
     * AB -> 28
     * ...
     * @param columnNumber 1 <= columnNumber <= 2^31 - 1
     * @return excel sheet column title code
     */
    String convertToTitle(int columnNumber);
}
