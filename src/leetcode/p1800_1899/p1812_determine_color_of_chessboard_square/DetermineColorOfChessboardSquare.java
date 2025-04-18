package leetcode.p1800_1899.p1812_determine_color_of_chessboard_square;

public interface DetermineColorOfChessboardSquare {
    /**
     * You are given coordinates, a string that represents the
     * coordinates of a square of the chessboard. Below is a chessboard
     * for your reference.
     *
     * Return true if the square is white, and false if the square is
     * black.
     *
     * The coordinate will always represent a valid chessboard square.
     * The coordinate will always have the letter first, and the number
     * second.
     *
     * @param coordinates coordinates.length == 2
     *                    'a' <= coordinates[0] <= 'h'
     *                    '1' <= coordinates[1] <= '8'
     */
    boolean squareIsWhite(String coordinates);
}
