package org.willxu.algorithm.service.impl.strlist;

import org.willxu.algorithm.service.strlist.CellsInRangeOnAnExcelSheet;

import java.util.ArrayList;
import java.util.List;

public class CellsInRangeOnAnExcelSheetLoop
        implements CellsInRangeOnAnExcelSheet {
    @Override
    public List<String> cellsInRange(String s) {
        List<String> output = new ArrayList<>();
        char[] chars = s.toCharArray();
        for (int col = chars[0]; col <= chars[3]; col++) {
            for (int row = chars[1]; row <= chars[4]; row++) {
                output.add(String.valueOf((char)col) + (char)row);
            }
        }
        return output;
    }
}
