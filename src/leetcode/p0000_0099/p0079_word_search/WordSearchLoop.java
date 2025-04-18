package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.WordSearch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordSearchLoop implements WordSearch {
    @Override
    public boolean exist(char[][] board, String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (chars[0] == board[i][j]) {
                    if (chars.length == 1) {
                        return true;
                    }
                    Set<List<Integer>> lineSet = new HashSet<>();
                    List<Integer> line = new ArrayList<>();
                    // m, n < 6, use m * 10 + n in set.
                    int grid = i * 10 + j;
                    line.add(grid);
                    lineSet.add(line);
                    for (int k = 1; k < chars.length; k++) {
                        if (lineSet.size() == 0) {
                            break;
                        }
                        Set<List<Integer>> newLineSet = new HashSet<>();
                        for (List<Integer> lastLine: lineSet) {
                            int tail = lastLine.get(lastLine.size() - 1);
                            int row = tail / 10;
                            int col = tail % 10;
                            // go top
                            if (row > 0) {
                                if (board[row - 1][col] == chars[k]) {
                                    int newGrid = (row - 1) * 10 + col;
                                    if (!lastLine.contains(newGrid)) {
                                        List<Integer> l =
                                                new ArrayList<>(lastLine);
                                        l.add(newGrid);
                                        newLineSet.add(l);
                                    }
                                }
                            }
                            // go left
                            if (col > 0) {
                                if (board[row][col - 1] == chars[k]) {
                                    int newGrid = row * 10 + (col - 1);
                                    if (!lastLine.contains(newGrid)) {
                                        List<Integer> l =
                                                new ArrayList<>(lastLine);
                                        l.add(newGrid);
                                        newLineSet.add(l);
                                    }
                                }
                            }
                            // go right
                            if (col < board[i].length - 1){
                                if (board[row][col + 1] == chars[k]) {
                                    int newGrid = row * 10 + (col + 1);
                                    if (!lastLine.contains(newGrid)) {
                                        List<Integer> l =
                                                new ArrayList<>(lastLine);
                                        l.add(newGrid);
                                        newLineSet.add(l);
                                    }
                                }
                            }
                            // go down
                            if (row < board.length - 1) {
                                if (board[row + 1][col] == chars[k]) {
                                    int newGrid = (row + 1) * 10 + col;
                                    if (!lastLine.contains(newGrid)) {
                                        List<Integer> l =
                                                new ArrayList<>(lastLine);
                                        l.add(newGrid);
                                        newLineSet.add(l);
                                    }
                                }
                            }
                        }
                        if (k == chars.length - 1 && newLineSet.size() > 0) {
                            return true;
                        }
                        lineSet = newLineSet;
                    }
                }
            }
        }
        return false;
    }
}
