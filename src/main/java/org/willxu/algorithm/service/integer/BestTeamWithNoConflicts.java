package org.willxu.algorithm.service.integer;

public interface BestTeamWithNoConflicts {
	/**
	 * You are the manager of a basketball team. For the upcoming
	 * tournament, you want to choose the team with the highest overall
	 * score. The score of the team is the sum of scores of all the
	 * players in the team.
	 * <p>
	 * However, the basketball team is not allowed to have conflicts. A
	 * conflict exists if a younger player has a strictly higher score
	 * than an older player. A conflict does not occur between players
	 * of the same age.
	 * <p>
	 * Given two lists, scores and ages, where each scores[i] and ages[i]
	 * represents the score and age of the i^th player, respectively,
	 * return the highest overall score of all possible basketball teams.
	 * 
	 * @param scores 1 <= scores.length, ages.length <= 1000
	 *               scores.length == ages.length
	 *               1 <= scores[i] <= 10^6
	 * @param ages 1 <= ages[i] <= 1000
	 */
int bestTeamScore(int[] scores, int[] ages);
}
