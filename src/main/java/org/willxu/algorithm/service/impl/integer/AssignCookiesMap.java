package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.AssignCookies;

import java.util.TreeMap;

public class AssignCookiesMap implements AssignCookies {
    @Override
    public int findContentChildren(int[] g, int[] s) {
        TreeMap<Integer, Integer> cookies = new TreeMap<>();
        for (int i: s) {
            if (cookies.containsKey(i)) {
                cookies.put(i, cookies.get(i) + 1);
            } else {
                cookies.put(i, 1);
            }
        }
        // the same of child wanted and cookies has.
        int count = 0;
        TreeMap<Integer, Integer> childrenLeft = new TreeMap<>();
        for (int i: g) {
            if (cookies.containsKey(i)) {
                if (cookies.get(i) == 1) {
                    cookies.remove(i);
                } else {
                    cookies.put(i, cookies.get(i) - 1);
                }
                count++;
            } else {
                if (childrenLeft.containsKey(i)) {
                    childrenLeft.put(i, childrenLeft.get(i) + 1);
                } else {
                    childrenLeft.put(i, 1);
                }
            }
        }
        while (childrenLeft.size() > 0 && cookies.size() > 0) {
            int minChild = childrenLeft.firstKey();
            int minCookie = cookies.firstKey();
            if (minChild <= minCookie) {
                count++;
                if (childrenLeft.get(minChild) == 1) {
                    childrenLeft.remove(minChild);
                } else {
                    childrenLeft.put(minChild, childrenLeft.get(minChild) - 1);
                }
            }
            if (cookies.get(minCookie) == 1) {
                cookies.remove(minCookie);
            } else {
                cookies.put(minCookie, cookies.get(minCookie) - 1);
            }
        }
        return count;
    }
}
