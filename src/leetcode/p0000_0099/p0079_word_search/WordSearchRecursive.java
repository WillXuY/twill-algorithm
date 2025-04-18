package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.WordSearch;

public class WordSearchRecursive implements WordSearch {
    boolean[][] visited;

    @Override
    public boolean exist(char[][] board, String word) {
        int rowLength = board.length;
        int colLength = board[0].length;
        visited = new boolean[rowLength][colLength];
        char[] chars = word.toCharArray();
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (board[i][j] == chars[0]
                        && recursive(board, i, j, chars, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean recursive(char[][] board, int r, int c,
                              char[] word, int index) {
        if (word.length == index) {
            return true;
        }
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length) {
            return false;
        }
        if (visited[r][c] || board[r][c] != word[index]) {
            return false;
        }
        visited[r][c] = true;
        if (recursive(board, r - 1, c, word, index + 1)
                || recursive(board, r + 1, c, word, index + 1)
                || recursive(board, r, c - 1, word, index + 1)
                || recursive(board, r, c + 1, word, index + 1)) {
            return true;
        }
        visited[r][c] = false;
        return false;
    }
}
