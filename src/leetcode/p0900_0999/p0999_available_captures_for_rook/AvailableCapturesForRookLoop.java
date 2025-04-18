package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.AvailableCapturesForRook;

public class AvailableCapturesForRookLoop implements AvailableCapturesForRook {
    /**
     * 1. Find the rook.
     * 2. Check the N E S W of the rook, find the p before B.
     *
     * @param board board.length == 8
     *              board[i].length == 8
     *              board[i][j] is either 'R', '.', 'B' or 'p'
     *              There is exactly one cell with board[i][j] == 'R'
     * @return count 'p' in north, east, south, west before B.
     */
    @Override
    public int numRookCaptures(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if ('R' == board[i][j]) {
                    int count = 0;
                    for (int north = j - 1; north >= 0; north--) {
                        if ('B' == board[i][north]) {
                            break;
                        } else if ('p' == board[i][north]) {
                            count++;
                            break;
                        }
                    }
                    for (int east = i + 1; east < board.length; east++) {
                        if ('B' == board[east][j]) {
                            break;
                        } else if ('p' == board[east][j]) {
                            count++;
                            break;
                        }
                    }
                    for (int south = j + 1; south < board[i].length; south++) {
                        if ('B' == board[i][south]) {
                            break;
                        } else if ('p' == board[i][south]) {
                            count++;
                            break;
                        }
                    }
                    for (int west = i - 1; west >= 0; west--) {
                        if ('B' == board[west][j]) {
                            break;
                        } else if ('p' == board[west][j]) {
                            count++;
                            break;
                        }
                    }
                    return count;
                }
            }
        }
        return -1;
    }
}
