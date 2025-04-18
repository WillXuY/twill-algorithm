package leetcode.p1300_1399.p1319_number_of_operations_to_make_network_connected;

public interface NumberOfOperationsToMakeNetworkConnected {
    /**
     * There are n computers numbered from 0 to n - 1 connected by
     * ethernet cables connections forming a network where
     * connections[i] = [a_i, b_i] represents a connection between
     * computers a_i and b_i. Any computer can reach any other computer
     * directly or indirectly through the network.
     * <p>
     * You are given an initial computer network connections. You can
     * extract certain cables between two directly connected computers,
     * and place them between any pair of disconnected computers to make
     * them directly connected.
     * <p>
     * Return the minimum number of times you need to do this in order
     * to make all the computers connected. If it is not possible,
     * return -1.
     *
     * @param n 1 <= n <= 10^5
     * @param connections 1 <= connections.length
     *                    <= min(n * (n - 1) / 2, 10^5)
     *                    connections[i].length == 2
     *                    0 <= a_i, b_i < n
     *                    a_i != b_i
     *                    There are no repeated connections.
     *                    No two computers are connected by more than
     *                    one cable.
     */
    int makeConnected(int n, int[][] connections);
}
