package org.willxu.algorithm.service.impl.doublepoint;

import org.willxu.algorithm.service.doublepoint.New21Game;

public class New21GameLoop implements New21Game {
    @Override
    public double new21Game(int n, int k, int maxPts) {
        double[] possibles = new double[n + 1];
        possibles[0] = 1;
        // sum param instead of loop count.
        double possibleSum = 0;
        for (int i = 1; i <= n; i++) {
            if (i - 1 < k) {
                possibleSum += possibles[i - 1];
            }
            int deleteIndex = i - maxPts - 1;
            if (0 <= deleteIndex && deleteIndex < k) {
                possibleSum -= possibles[deleteIndex];
            }
            possibles[i] = possibleSum / maxPts;
        }
        double output = 0;
        for (int i = k; i <= n; i++) {
            output += possibles[i];
        }
        return output;
    }
}
