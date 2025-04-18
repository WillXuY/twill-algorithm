package leetcode.p2300_2399.p2383_minimum_hours_of_training_to_win_competition;

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
