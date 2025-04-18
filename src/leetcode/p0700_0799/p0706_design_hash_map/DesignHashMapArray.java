/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0700_0799.p0706_design_hash_map;

public class DesignHashMapArray implements DesignHashMap {
    private int[][] map;

    /**
     * Initializes the object with an empty map.
     */
    public DesignHashMapArray() {
        map = new int[][] {};
    }

    @Override
    public void put(int key, int value) {
        // if contains
        for (int i = 0; i < map.length; i++) {
            if (map[i][0] == key) {
                map[i][1] = value;
                return;
            }
        }
        // add
        int[][] addIn = new int[map.length + 1][2];
        System.arraycopy(map, 0, addIn, 0, map.length);
        addIn[addIn.length - 1] = new int[] {key, value};
        map = addIn;
    }

    @Override
    public int get(int key) {
        for (int[] row: map) {
            if (row[0] == key) {
                return row[1];
            }
        }
        return -1;
    }

    @Override
    public void remove(int key) {
        for (int i = 0; i < map.length; i++) {
            if (map[i][0] == key) {
                int[][] remove = new int[map.length - 1][2];
                System.arraycopy(map, 0, remove, 0, i);
                System.arraycopy(map, i + 1, remove, i,
                        map.length - 1 - i);
                map = remove;
            }
        }
    }
}
