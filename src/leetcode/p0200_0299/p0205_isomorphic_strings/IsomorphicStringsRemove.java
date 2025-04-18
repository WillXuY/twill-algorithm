/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0200_0299.p0205_isomorphic_strings;

public class IsomorphicStringsRemove implements IsomorphicStrings {
    @Override
    public boolean isIsomorphic(String s, String t) {
        while (s.length() > 0) {
            if (s.length() != t.length()) {
                return false;
            }
            int si = 0;
            int ti = 0;
            char sc = s.charAt(si);
            char tc = t.charAt(ti);
            while (si != -1 || ti != -1) {
                if (si != ti) {
                    return false;
                }
                si = s.indexOf(sc, si + 1);
                ti = t.indexOf(tc, ti + 1);
            }
            final String specialToken = "*|^$+?.()[]{}\\";
            String sr = String.valueOf(sc);
            if (specialToken.indexOf(sc) > -1) {
                sr = "\\" + sr;
            }
            String tr = String.valueOf(tc);
            if (specialToken.indexOf(tc) > -1) {
                tr = "\\" + tr;
            }
            s = s.replaceAll(sr, "");
            t = t.replaceAll(tr, "");
        }
        return true;
    }
}
