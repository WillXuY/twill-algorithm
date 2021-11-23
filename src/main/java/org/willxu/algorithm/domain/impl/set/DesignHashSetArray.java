/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.domain.impl.set;

import org.willxu.algorithm.domain.set.DesignHashSet;

public class DesignHashSetArray implements DesignHashSet {
    private int[] arr;

    @Override
    public void add(int key) {
        if (arr == null || arr.length == 0) {
            arr = new int[] {key};
            return;
        }
        int[] addIn = new int[arr.length + 1];
        if (!contains(key)) {
            System.arraycopy(arr, 0, addIn, 0, arr.length);
            addIn[addIn.length - 1] = key;
            arr = addIn;
        }
    }

    @Override
    public void remove(int key) {
        if (arr == null || arr.length == 0) {
            return;
        } else if (arr.length == 1 && arr[0] == key) {
            arr = new int[] {};
            return;
        }
        int[] remove = new int[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                System.arraycopy(arr, 0, remove, 0, i);
                System.arraycopy(arr, i + 1, remove, i,
                        remove.length - i);
                arr = remove;
                return;
            }
        }
    }

    @Override
    public boolean contains(int key) {
        if (arr == null) {
            return false;
        }
        for (int i: arr) {
            if (key == i) {
                return true;
            }
        }
        return false;
    }
}
