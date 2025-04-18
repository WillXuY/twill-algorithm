/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.domain.set;

import org.junit.jupiter.api.Test;
import org.willxu.algorithm.domain.impl.set.DesignHashSetArray;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DesignHashSetTest {
    /**
     * At most 10^4 calls will be made to add, remove and contains.
     */
    @Test
    public void test() {
        DesignHashSet array = new DesignHashSetArray();
        array.add(1);
        array.add(2);
        assertTrue(array.contains(1));
        assertFalse(array.contains(3));
        // 1, 2
        array.add(2);
        assertTrue(array.contains(2));
        array.remove(2);
        assertFalse(array.contains(2));
    }
}
