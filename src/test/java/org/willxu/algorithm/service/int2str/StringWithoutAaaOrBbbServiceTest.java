package org.willxu.algorithm.service.int2str;

import org.willxu.algorithm.service.impl.int2str.StringWithoutAaaOrBbbServiceImpl;
import org.junit.jupiter.api.Test;

public class StringWithoutAaaOrBbbServiceTest {
    private final StringWithoutAaaOrBbbService stringWithoutAaaOrBbbService = new StringWithoutAaaOrBbbServiceImpl();

    @Test
    public void testGetStringWithoutAaaOrBbbBruteForce() {
        int A = 4, B = 1;
        String S = stringWithoutAaaOrBbbService.getStringWithoutAaaOrBbb(A, B);
        System.out.println(S);
    }
}
