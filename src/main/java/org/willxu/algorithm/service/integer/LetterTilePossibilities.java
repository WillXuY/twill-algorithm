package org.willxu.algorithm.service.integer;

public interface LetterTilePossibilities {
    /**
     * You have n  tiles, where each tile has one letter tiles[i]
     * printed on it.
     * <p>
     * Return the number of possible non-empty sequences of letters you
     * can make using the letters printed on those tiles.
     *
     * @param tiles 1 <= tiles.length <= 7
     *              tiles consists of uppercase English letters.
     */
    int numTilePossibilities(String tiles);
}
