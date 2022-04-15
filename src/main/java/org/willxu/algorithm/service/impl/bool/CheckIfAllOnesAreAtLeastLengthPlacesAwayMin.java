package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.CheckIfAllOnesAreAtLeastLengthPlacesAway;

public class CheckIfAllOnesAreAtLeastLengthPlacesAwayMin
        implements CheckIfAllOnesAreAtLeastLengthPlacesAway {
    @Override
    public boolean kLengthApart(int[] nums, int k) {
        int distance = 0;
        boolean start = false;
        for (int i: nums) {
            if (i == 1) {
                if (start) {
                    if (distance < k) {
                        return false;
                    }
                    distance = 0;
                } else {
                    start = true;
                }
            } else if (start) {
                distance++;
            }
        }
        return true;
    }
}
