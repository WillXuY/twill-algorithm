package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MinimumHoursOfTrainingToWinCompetition;

public class MinimumHoursOfTrainingToWinCompetitionMax
        implements MinimumHoursOfTrainingToWinCompetition {
    @Override
    public int minNumberOfHours(int initialEnergy, int initialExperience,
                                int[] energy, int[] experience) {
        int maxEnergy = 0;
        int maxExp = 0;
        int getExp = initialExperience;
        for (int i = 0; i < energy.length; i++) {
            maxEnergy += energy[i];
            int needExp = Math.max(0, experience[i] - getExp + 1);
            if (needExp > maxExp) {
                maxExp = needExp;
            }
            getExp += experience[i];
        }
        int needEnergy = Math.max(0, maxEnergy - initialEnergy + 1);
        return maxExp + needEnergy;
    }
}
