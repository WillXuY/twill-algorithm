package leetcode.p0400_0499.p0492_construct_the_rectangle;

public interface ConstructTheRectangle {
    /**
     * A web developer needs to know how to design a web page's size.
     * So, given a specific rectangular web page's area, your job by now
     * is to design a rectangular web page, whose length L and width W
     * satisfy the following requirements:
     * 1. The area of the rectangular web page you designed must equal
     *    to the given target area.
     * 2. The width W should not be larger than the length L, which
     *    means L >= W.
     * 3. The difference between length L and which W should be as small
     *    as possible.
     * Return an array [L, W] where L and W are the length and width of
     * the web page you designed in sequence.
     *
     * @param area 1 <= area <= 10^7
     * @return the length and the width.
     */
    int[] constructRectangle(int area);
}
