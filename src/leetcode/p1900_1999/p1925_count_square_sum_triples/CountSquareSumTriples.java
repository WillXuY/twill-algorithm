package org.willxu.algorithm.service.integer;

public interface CountSquareSumTriples {
    /**
     * A square triple (a,b,c) is a triple where a, b, and c are
     * integers and a2 + b2 = c2.
     *
     * Given an integer n, return the number of square triples such that
     * 1 <= a, b, c <= n.
     *
     * @param n 1 <= n <= 250
     */
    int countTriples(int n);
}
