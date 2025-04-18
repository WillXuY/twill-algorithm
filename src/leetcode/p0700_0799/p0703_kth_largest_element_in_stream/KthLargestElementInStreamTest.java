/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.domain.other;

import org.junit.jupiter.api.Test;
import org.willxu.algorithm.domain.impl.other.KthLargestElementInStreamArray;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthLargestElementInStreamTest {
    /**
     * At most 10^4 calls will be made to add.
     */
    @Test
    public void testArray() {
        KthLargestElementInStream array =
                new KthLargestElementInStreamArray(3, new int[] {4, 5, 8, 2});
        assertEquals(4, array.add(3));
        assertEquals(5, array.add(5));
        assertEquals(5, array.add(10));
        assertEquals(8, array.add(9));
        assertEquals(8, array.add(4));
    }
}
