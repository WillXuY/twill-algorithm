package leetcode.p0200_0299.p0292_nim_game;

public class NimGameDivide4 implements NimGame {
    @Override
    public boolean canWinNim(int n) {
        return (n & 3) != 0;
    }
}
