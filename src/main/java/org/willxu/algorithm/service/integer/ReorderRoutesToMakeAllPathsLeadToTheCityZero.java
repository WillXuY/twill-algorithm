package org.willxu.algorithm.service.integer;

public interface ReorderRoutesToMakeAllPathsLeadToTheCityZero {
	/**
	 * There are n cities numbered from 0 to n - 1 and n - 1 roads such
	 * that there is only one way to travel between two different cities
	 * (this network form a tree). Last year, The ministry of transport
	 * decided to orient the roads in one direction because they are too
	 * narrow.
	 * <p>
	 * Roads are represented by connections where
	 * connections[i] = [a_i, b_i] represents a road from city a_i to
	 * city b_i.
	 * <p>
	 * This year, there will be a big event in the capital (city 0), and
	 * many people want to travel to this city.
	 * <p>
	 * Your task consists of reorienting some roads such that each city
	 * can visit the city 0. Return the minimum number of edges changed.
	 * <p>
	 * It's guaranteed that each city can reach city 0 after reorder.
	 * 
	 * @param n 2 <= n <= 5 * 10^4
	 * @param connections connections.length == n - 1
	 *                    connections[i].length == 2
	 *                    0 <= a_i, b_i <= n - 1
	 *                    a_i != b_i
	 */
	int minReorder(int n, int[][] connections);
}
