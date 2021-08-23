package org.willxu.algorithm.service.extend;

public abstract class FirstBadVersion {
    private int bad;

    public void setBad(int bad) {
        this.bad = bad;
    }

    /**
     * You are given an API bool isBadVersion(version) which returns
     * whether version is bad. Implement a function to find the first
     * bad version.
     * @param version version number need to be test
     * @return is bad or not
     */
    protected boolean isBadVersion(int version) {
        return version >= bad;
    }

    /**
     * You are product manager and currently leading a team to develop
     * a new product. Unfortunately, the latest version of your product
     * fails the quality check. Since each version is developed based on
     * the previous version, all the versions after a bad version are
     * also bad.
     *
     * Suppose you have n version [1, 2, ..., n] and you want to find
     * out the first bad one, which causes all the following ones to be
     * bad.
     *
     * You should minimize the number of calls to the API.
     *
     * @param n 1 <= bad <= n <= 2^31 - 1
     * @return the index of the first bad version.
     */
    public abstract int firstBadVersion(int n);
}
