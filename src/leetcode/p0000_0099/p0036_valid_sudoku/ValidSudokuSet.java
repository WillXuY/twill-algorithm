package leetcode.p0000_0099.p0036_valid_sudoku;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSudokuSet implements ValidSudoku {
    @Override
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rowSetMap = new HashMap<>();
        Map<Integer, Set<Character>> colSetMap = new HashMap<>();
        Map<Integer, Set<Character>> boxSetMap = new HashMap<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if ('.' == board[i][j]) {
                    continue;
                }
                if (rowSetMap.containsKey(i)) {
                    Set<Character> rowSet = rowSetMap.get(i);
                    if (rowSet.contains(board[i][j])) {
                        return false;
                    } else {
                        rowSet.add(board[i][j]);
                    }
                } else {
                    Set<Character> rowSet = new HashSet<>();
                    rowSet.add(board[i][j]);
                    rowSetMap.put(i, rowSet);
                }
                if (colSetMap.containsKey(j)) {
                    Set<Character> colSet = colSetMap.get(j);
                    if (colSet.contains(board[i][j])) {
                        return false;
                    } else {
                        colSet.add(board[i][j]);
                    }
                } else {
                    Set<Character> colSet = new HashSet<>();
                    colSet.add(board[i][j]);
                    colSetMap.put(j, colSet);
                }
                int boxKey = i / 3 * 10 + j / 3;
                if (boxSetMap.containsKey(boxKey)) {
                    Set<Character> boxSet = boxSetMap.get(boxKey);
                    if (boxSet.contains(board[i][j])) {
                        return false;
                    } else {
                        boxSet.add(board[i][j]);
                    }
                } else {
                    Set<Character> boxSet = new HashSet<>();
                    boxSet.add(board[i][j]);
                    boxSetMap.put(boxKey, boxSet);
                }
            }
        }
        return true;
    }
}
