package leetcode.p2100_2199.p2194_cells_in_range_on_an_excel_sheet;

import java.util.List;

public interface CellsInRangeOnAnExcelSheet {
    /**
     * A cell (r, c) of an excel sheet is represented as a string
     * "<col><row>" where:
     * <p>
     * - <col> denotes the column number c of the cell. It is
     *   represented by alphabetical letters.
     *   + For example, the 1st column is denoted by 'A', the 2nd by
     *     'B', the 3rd by 'C', and so on.
     * - <row> is the row number r of the cell. The rth row is
     *   represented by the integer r.
     * <p>
     * You are given a string s in the format
     * "<col1><row1>:<col2><row2>", where <col1> represents the column
     * c1, <row1> represents the row r1, <col2> represents the column
     * c2, and <row2> represents the row r2, such that r1 <= r2 and
     * c1 <= c2.
     * <p>
     * Return the list of cells (x, y) such that r1 <= x <= r2 and
     * c1 <= y <= c2. The cells should be represented as strings in the
     * format mentioned above and be sorted in non-decreasing order
     * first by columns and then by rows.
     *
     * @param s s.length == 5
     *          'A' <= s[0] <= s[3] <= 'Z'
     *          '1' <= s[1] <= s[4] <= '9'
     *          consists of uppercase English letters, digits and ':'.
     */
    List<String> cellsInRange(String s);
}
