package org.willxu.algorithm.service.strlist;

import java.util.List;

public interface AlertUsingSameKeyCardThreeOrMoreTimesInOneHourPeriod {
	/**
	 * LeetCode company workers use key-cards to unlock office doors.
	 * Each time a worker uses their key-card, the security system saves
	 * the worker's name and the time when it was used. The system emits
	 * an alert if any worker uses the key-card three or more times in a
	 * one-hour period.
	 * <p>
	 * You are given a list of strings keyName and keyTime where
	 * [keyName[i], keyTime[i]] corresponds to a person's name and the
	 * time when their key-card was used in a single day.
	 * <p>
	 * Access times are given in the 24-hour time format "HH:MM", such
	 * as "23:51" and "09:49".
	 * <p>
	 * Return a list of unique worker names who received an alert for
	 * frequent keycard use. Sort the names in ascending order
	 * alphabetically.
	 * <p>
	 * Notice that "10:00" - "11:00" is considered to be within a
	 * one-hour period, while "22:51" - "23:52" is not considered to be
	 * within a one-hour period.
	 * 
	 * @param keyName 1 <= keyName.length, keyTime.length <= 10^5
	 *                keyName.length == keyTime.length
	 *                [keyName[i], keyTime[i]] is unique.
	 *                1 <= keyName[i].length <= 10
	 *                keyName[i] contains only lowercase English letters.
	 * @param keyTime keyTime[i] is in the format "HH:MM".
	 */
	List<String> alertNames(String[] keyName, String[] keyTime);
}
