package com.willxu.algorithm.domain;

import org.junit.jupiter.api.Test;

public class AllOneTest {
    @Test
    public void testAllOne() {
        AllOne obj = new AllOne();
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
