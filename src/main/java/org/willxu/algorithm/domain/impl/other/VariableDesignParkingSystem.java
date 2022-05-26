package org.willxu.algorithm.domain.impl.other;

import org.willxu.algorithm.domain.other.AbstractDesignParkingSystem;

public class VariableDesignParkingSystem extends AbstractDesignParkingSystem {
    private final int bigMax;
    private final int mediumMax;
    private final int smallMax;

    private int bigParked;
    private int mediumParked;
    private int smallParked;

    public VariableDesignParkingSystem(int big, int medium, int small) {
        super(big, medium, small);
        bigMax = big;
        mediumMax = medium;
        smallMax = small;
        bigParked = 0;
        mediumParked = 0;
        smallParked = 0;
    }

    @Override
    public boolean addCar(int carType) {
        switch (carType) {
            case TYPE_BIG:
                if (bigParked == bigMax) {
                    return false;
                } else {
                    bigParked++;
                }
                break;
            case TYPE_MEDIUM:
                if (mediumParked == mediumMax) {
                    return false;
                } else {
                    mediumParked++;
                }
                break;
            case TYPE_SMALL:
                if (smallParked == smallMax) {
                    return false;
                } else {
                    smallParked++;
                }
        }
        return true;
    }
}
