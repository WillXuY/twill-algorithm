package org.willxu.algorithm.service.integer;

public interface MinimumHoursOfTrainingToWinCompetition {
    /**
     * You are entering a competition, and are given two positive
     * integers initialEnergy and initialExperience denoting your
     * initial energy and initial experience respectively.
     * <p>
     * You are also given two 0-indexed integer arrays energy and
     * experience, both of length n.
     * <p>
     * You will face n opponents in order. The energy and experience of
     * the ith opponent is denoted by energy[i] and experience[i]
     * respectively. When you face an opponent, you need to have both
     * strictly greater experience and energy to defeat them and move to
     * the next opponent if available.
     * <p>
     * Defeating the ith opponent increases your experience by
     * experience[i], but decreases your energy by energy[i].
     * <p>
     * Before starting the competition, you can train for some number of
     * hours. After each hour of training, you can either choose to
     * increase your initial experience by one, or increase your initial
     * energy by one.
     * <p>
     * Return the minimum number of training hours required to defeat
     * all n opponents.
     *
     * @param initialEnergy 1 <= initialEnergy <= 100
     * @param initialExperience 1 <= initialExperience <= 100
     * @param energy 1 <= energy.length == experience.length <= 100
     * @param experience 1 <= energy[i], experience[i] <= 100
     */
    int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy,
                         int[] experience);
}
