package org.willxu.algorithm.service.integer;

public interface MorrorReflection {
    /**
     * There is a special square room with mirrors on each of the four
     * walls. Except for the southwest corner, there are receptors on
     * each of the remaining corners, numbered 0, 1, and 2.
     * <p>
     * The square room has walls of length p and a laser ray from the
     * southwest corner first meets the east wall at a distance q from
     * the 0^th receptor.
     * <p>
     * Given the two integers p and q, return the number of the receptor
     * that the ray meets first.
     * <p>
     * The test cases are guaranteed so that the ray will meet a
     * receptor eventually.
     *
     * @param p,q 1 <= q <= p <= 1000
     */
    int mirrorReflection(int p, int q);
}
