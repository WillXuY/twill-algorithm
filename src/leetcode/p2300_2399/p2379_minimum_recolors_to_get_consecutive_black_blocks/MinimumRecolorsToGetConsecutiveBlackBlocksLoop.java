package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MinimumRecolorsToGetConsecutiveBlackBlocks;

import java.util.ArrayList;
import java.util.List;

public class MinimumRecolorsToGetConsecutiveBlackBlocksLoop
        implements MinimumRecolorsToGetConsecutiveBlackBlocks {
    @Override
    public int minimumRecolors(String blocks, int k) {
        List<Integer> white = new ArrayList<>();
        List<Integer> black = new ArrayList<>();
        boolean lastWhite = true;
        int count = 0;
        for (char b: blocks.toCharArray()) {
            if (b == 'W') {
                if (lastWhite) {
                    count++;
                } else {
                    black.add(count);
                    count = 1;
                }
                lastWhite = true;
            } else if (b == 'B') {
                if (lastWhite) {
                    white.add(count);
                    count = 1;
                } else {
                    count++;
                }
                lastWhite = false;
            }
        }
        if (count > 0) {
            if (lastWhite) {
                white.add(count);
            } else {
                black.add(count);
            }
        }
        int output = Integer.MAX_VALUE;
        for (int i = 0; i < black.size(); i++) {
            int countBlack = black.get(i);
            int countWhite = 0;
            int index = 1;
            while (countBlack < k) {
                if (i + index >= black.size()) {
                    countWhite += k - countBlack;
                    break;
                }
                int whiteLeft = white.get(i + index);
                countBlack += black.get(i + index) + whiteLeft;
                countWhite += whiteLeft;
                index++;
            }
            if (countBlack < k) {
                break;
            }
            if (countWhite == 0) {
                return 0;
            } else if (countWhite < output) {
                output = countWhite;
            }
        }
        if (black.size() == 0) {
            output = k;
        }
        return output;
    }
}
