/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.domain;

public class AllOne {
    private String[] keys;
    private int[] values;
    private int size;

    /** Initialize your data structure here. */
    public AllOne() {
        keys = new String[]{};
        values = new int[]{};
        size = 0;
    }

    /** Inserts a new key <Key> with value 1. Or increments an existing key by 1. */
    public void inc(String key) {
        int index = findElementIndex(key);
        if (index == -1) {
            addNewKey(key);
        } else {
            values[index] = values[index] + 1;
            sortAdd(index);
        }
    }

    /**
     * (弃用)排序，从大到小，根据 index 往前遍历直到 0,或者 value 不等到 indexDifferent，
     * 交换最后 value 相等的 indexDifferent + 1 与 index
     * # 清晰胜于机巧
     * 从头遍历数据，找到第一个 < index 的 i 交换 index + 1 与 i - 1;
     * 5,3,1,1,1 index = 4
     * 5,3,1,1,2 i = 2
     * 5,3,2,2,1,1 index = 5
     * 5,3,2,2,1,2 index = 4
     * 2,1 index = 1
     * 2,2 index = pass
     */
    private void sortAdd(int index) {
        for (int i = 0; i < index; i++) {
            if (values[i] < values[index]) {
                exchangeValue(index, i);
            }
        }
    }

    /**
     * 从大到小排序，插入末位
     * @param key key
     */
    private void addNewKey(String key){
        String[] newKeys = new String[size + 1];
        int[] newValues = new int[size + 1];
        for (int i = 0; i < size; i++) {
            newKeys[i] = keys[i];
            newValues[i] = values[i];
        }
        newKeys[size] = key;
        newValues[size] = 1;
        keys = newKeys;
        values = newValues;
        size++;
    }

    private int findElementIndex(String key) {
        for (int i = 0; i < size; i++) {
            if (keys[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    /** Decrements an existing key by 1. If Key's value is 1, remove it from the data structure. */
    public void dec(String key) {
        int index = findElementIndex(key);
        if (index != -1) {
            values[index] = values[index] - 1;
            if (values[index] == 0) {
                remove(index);
            } else {
                sortMinus(index);
            }
        }
    }

    /**
     * 排序从大到小，从最后遍历到index,找到第一个大于index的i，或者不做修改
     * # 清晰胜于机巧
     * 5,2,2,1,1
     * 5,1,2,1,1 index = 1, i = 2
     * @param index index
     */
    private void sortMinus(int index) {
        for (int i = size - 1; i > index; i--) {
            if (values[index] < values[i]) {
                exchangeValue(index, i);
                return;
            }
        }
    }

    private void exchangeValue(int index, int i) {
        values[i] = values[i] ^ values[index];
        values[index] = values[i] ^ values[index];
        values[i] = values[i] ^ values[index];
        String change = keys[i];
        keys[i] = keys[index];
        keys[index] = change;
    }

    private void remove(int index) {
        int[] newValues = new int[size - 1];
        String[] newKeys = new String[size - 1];
        for (int i = 0; i < index; i++) {
            newKeys[i] = keys[i];
            newValues[i] = values[i];
        }
        for (int i = index; i < size - 1; i++) {
            newKeys[i] = keys[i+1];
            newValues[i] = values[i+1];
        }
        values = newValues;
        keys = newKeys;
        size--;
    }

    /** Returns one of the keys with maximal value. */
    public String getMaxKey() {
        if (size == 0) {
            return "";
        } else {
            return keys[0];
        }
    }

    /** Returns one of the keys with Minimal value. */
    public String getMinKey() {
        if (size == 0) {
            return "";
        } else {
            return keys[size - 1];
        }
    }
}
