package org.willxu.algorithm.domain.other;

import org.junit.jupiter.api.Test;
import leetcode.p1600_1699.p1603_design_parking_system.VariableDesignParkingSystem;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DesignParkingSystemTest {

    /**
     * At most 1000 calls wil be made to addCar.
     */
    @Test
    public void test() {
        AbstractDesignParkingSystem variable =
                new VariableDesignParkingSystem(1, 1, 0);
        final int TYPE_BIG = 1;
        assertTrue(variable.addCar(TYPE_BIG));
        final int TYPE_MEDIUM = 2;
        assertTrue(variable.addCar(TYPE_MEDIUM));
        final int TYPE_SMALL = 3;
        assertFalse(variable.addCar(TYPE_SMALL));
        assertFalse(variable.addCar(TYPE_BIG));
    }
}
