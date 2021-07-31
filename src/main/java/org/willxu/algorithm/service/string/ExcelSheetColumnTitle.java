/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

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
