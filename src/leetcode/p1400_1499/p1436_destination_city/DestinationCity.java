package leetcode.p1400_1499.p1436_destination_city;

import java.util.List;

public interface DestinationCity {
    /**
     * You are given the array paths, where
     * paths[i] = [cityA_i, cityB_i] means there exists a direct path
     * going from cityA_i to cityB_i. Return the destination city, that
     * is, the city without any path outgoing to another city.
     * It is guaranteed that the graph of paths forms a line without any
     * loop, therefore, there will be exactly one destination city.
     *
     * @param paths 1 <= path.length <= 100
     *              path[i].length == 2
     *              1 <= cityA_i.length, cityB_i.length <= 10
     *              cityA_i != cityB_i
     *              All strings consist of lowercase and uppercase
     *              English letters and the space character.
     * @return destination city.
     */
    String destCity(List<List<String>> paths);
}
