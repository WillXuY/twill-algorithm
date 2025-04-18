package leetcode.p1700_1799.p1791_find_center_of_star_graph;

public class FindCenterOfStarGraphEqual implements FindCenterOfStarGraph {
    @Override
    public int findCenter(int[][] edges) {
        return edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] ?
            edges[0][0] : edges[0][1];
    }
}
