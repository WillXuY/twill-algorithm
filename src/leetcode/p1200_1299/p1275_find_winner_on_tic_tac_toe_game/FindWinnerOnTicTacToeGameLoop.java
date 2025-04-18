package leetcode.p1200_1299.p1275_find_winner_on_tic_tac_toe_game;

public class FindWinnerOnTicTacToeGameLoop
        implements FindWinnerOnTicTacToeGame {
    @Override
    public String tictactoe(int[][] moves) {
        boolean[][] gridAx = new boolean[3][3];
        boolean[][] gridBo = new boolean[3][3];
        for (int i = 0; i < moves.length; i++) {
            if ((i & 1) == 1) {
                gridBo[moves[i][0]][moves[i][1]] = true;
                if (checkWin(gridBo, moves[i])) {
                    return "B";
                }
            } else {
                gridAx[moves[i][0]][moves[i][1]] = true;
                if (checkWin(gridAx, moves[i])) {
                    return "A";
                }
            }
        }
        if (moves.length == 9) {
            return "Draw";
        } else {
            return "Pending";
        }
    }

    private boolean checkWin(boolean[][] grid, int[] move) {
        int r = move[0];
        int c = move[1];
        boolean rowWin = grid[r][0] && grid[r][1] && grid[r][2];
        boolean colWin = grid[0][c] && grid[1][c] && grid[2][c];
        if (rowWin || colWin) {
            return true;
        }
        boolean cross1 = grid[0][0] && grid[1][1] && grid[2][2];
        boolean cross2 = grid[0][2] && grid[1][1] && grid[2][0];
        if ((r == 0 && c == 0) || (r == 2 && c == 2)) {
            return cross1;
        } else if ((r == 0 && c == 2) || (r == 2 && c == 0)) {
            return cross2;
        } else if (r == 1 && c == 1) {
            return cross1 || cross2;
        }
        return false;
    }
}
