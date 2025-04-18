package leetcode.p2100_2199.p2194_cells_in_range_on_an_excel_sheet;

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
