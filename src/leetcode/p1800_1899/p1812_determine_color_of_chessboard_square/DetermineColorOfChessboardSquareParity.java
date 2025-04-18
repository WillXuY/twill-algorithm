package leetcode.p1800_1899.p1812_determine_color_of_chessboard_square;

public class DetermineColorOfChessboardSquareParity
        implements DetermineColorOfChessboardSquare {
    @Override
    public boolean squareIsWhite(String coordinates) {
        char[] chars = coordinates.toCharArray();
        return ((chars[0] + chars[1]) & 1) == 1;
    }
}
