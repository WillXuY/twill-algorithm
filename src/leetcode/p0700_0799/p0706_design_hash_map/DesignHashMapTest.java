/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0700_0799.p0706_design_hash_map;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DesignHashMapTest {
    /**
     * At most 10^4 calls will be made to put, get, and remove.
     */
    @Test
    public void testArray() {
        DesignHashMap array = new DesignHashMapArray();
        array.put(1, 1);
        array.put(2, 2);
        assertEquals(1, array.get(1));
        assertEquals(-1, array.get(3));
        array.put(2, 1);
        assertEquals(1, array.get(2));
        array.remove(2);
        assertEquals(-1, array.get(2));
    }
}
