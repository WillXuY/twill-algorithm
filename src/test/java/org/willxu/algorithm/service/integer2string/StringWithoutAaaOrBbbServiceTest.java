package org.willxu.algorithm.service.integer2string;

import org.willxu.algorithm.service.impl.integer2string.StringWithoutAaaOrBbbServiceImpl;
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
