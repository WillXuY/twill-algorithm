/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

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
