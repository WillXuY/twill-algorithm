package leetcode.p1400_1499.p1437_check_if_all_ones_are_at_least_length_places_away;

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
