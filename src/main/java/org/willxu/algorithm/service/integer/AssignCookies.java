package org.willxu.algorithm.service.integer;

public interface AssignCookies {
    /**
     * Assign you are an awesome parent and want to give your children
     * some cookies. But, you should give each child at most one cookie.
     * Each child i has a greed factor g[i], which is the minimum size
     * of a cookie that the child will be content with; and each cookie
     * j has a size s[j]. If s[j] > g[j], we can assign the cookie j to
     * the child i, and the child i will be content. Your goal os to
     * maximize the number of your content children and output the
     * maximum number.
     *
     * @param g 1 <= g.length <= 3 * 10^4
     *          1 <= g[i] <= 2^31 - 1
     * @param s 0 <= s.length <= 3 * 10^4
     *          1 <= s[j] <= 2^31 - 1
     * @return the maximize number can content the children.
     */
    int findContentChildren(int[] g, int[] s);
}
