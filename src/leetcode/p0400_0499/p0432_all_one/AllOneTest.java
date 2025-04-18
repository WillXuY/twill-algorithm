/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.domain.other;

import org.junit.jupiter.api.Test;
import org.willxu.algorithm.domain.impl.other.AllOneArray;

public class AllOneTest {
    @Test
    public void testAllOne() {
        AllOne obj = new AllOneArray();
        String key1 = "key1";
        obj.inc(key1);
        String key2 = "key2";
        obj.inc(key2);
        String key3 = "key3";
        obj.inc(key3);
        obj.inc(key3);
        obj.inc(key3);
        obj.dec(key3);
        obj.dec(key3);
        obj.dec(key3);
        String param_3 = obj.getMaxKey();
        String param_4 = obj.getMinKey();
        System.out.println(param_3 + param_4);
    }
}
