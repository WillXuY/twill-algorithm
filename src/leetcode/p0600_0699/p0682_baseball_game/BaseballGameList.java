/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0600_0699.p0682_baseball_game;

import java.util.ArrayList;
import java.util.List;

public class BaseballGameList implements BaseballGame {
    @Override
    public int calPoints(String[] ops) {
        List<Integer> scoreList = new ArrayList<>();
        for (String s: ops) {
            switch (s) {
                case "+" -> {
                    int count = scoreList.get(scoreList.size() - 1)
                            + scoreList.get(scoreList.size() - 2);
                    scoreList.add(count);
                }
                case "D" -> {
                    int d = 2 * scoreList.get(scoreList.size() - 1);
                    scoreList.add(d);
                }
                case "C" -> scoreList.remove(scoreList.size() - 1);
                default -> scoreList.add(Integer.valueOf(s));
            }
        }
        return scoreList.stream().mapToInt(Integer::intValue).sum();
    }
}
