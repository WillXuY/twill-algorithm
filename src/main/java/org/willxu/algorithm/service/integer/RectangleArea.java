package org.willxu.algorithm.service.integer;

public interface RectangleArea {
    /**
     * Given the coordinates of two rectilinear rectangles in a 2D
     * plane, return the total area covered by the two rectangles.
     * <p>
     * The first rectangle is defined by its bottom-left corner
     * (ax1, ay1) and its top-right corner (ax2, ay2).
     * <p>
     * The second rectangle is defined by its bottom-left corner
     * (bx1, by1) and its top-right corner (bx2, by2).
     *
     * @param ax1,ax2 -10^4 <= ax1 <= ax2 <= 10^4
     * @param ay1,ay2 -10^4 <= ay1 <= ay2 <= 10^4
     * @param bx1,bx2 -10^4 <= bx1 <= bx2 <= 10^4
     * @param by1,by2 -10^4 <= by1 <= by2 <= 10^4
     */
    int computeArea(int ax1, int ay1, int ax2, int ay2,
                    int bx1, int by1, int bx2, int by2);
}
