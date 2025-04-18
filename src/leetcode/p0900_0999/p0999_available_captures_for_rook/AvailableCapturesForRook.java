package leetcode.p0900_0999.p0999_available_captures_for_rook;

public interface AvailableCapturesForRook {
    /**
     * On an 8 x 8 chessboard, there is exactly one white rook 'R' and
     * some number of white bishops 'B', black pawns 'p', and empty
     * squares '.'.
     * When the rook moves, it chooses one of four cardinal directions
     * (north, east, south, or west), then moves in that direction until
     * it chooses to stop, reaches the edge of the board, captures a
     * black pawn, or is blocked by a white bishop. A rook is considered
     * attacking a pawn, or is blocked by a white bishop. A rook is
     * considered attacking a pawn if the rook can capture the pawn on
     * the white rook is the number of pawns that the rook is attacking.
     * Return the number of available captures for the white rook.
     *
     * @param board board.length == 8
     *              board[i].length == 8
     *              board[i][j] is either 'R', '.', 'B' or 'p'
     *              There is exactly one cell with board[i][j] == 'R'
     * @return the number of available captures for the white rook.
     */
    int numRookCaptures(char[][] board);
}
