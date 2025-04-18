package leetcode.p0100_0199.p0117_population_next_right_pointers_in_each_node_ii;

import org.willxu.algorithm.provide.tree.Node;

import java.util.ArrayList;
import java.util.List;

public class PopulatingNextRightPointersInEachNodeIiLevel
        implements PopulatingNextRightPointersInEachNodeIi {
    @Override
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        List<Node> level = new ArrayList<>();
        level.add(root);
        while (level.size() > 0) {
            List<Node> nextLevel = new ArrayList<>();
            for (int i = 0; i < level.size(); i++) {
                Node node = level.get(i);
                if (i < level.size() - 1) {
                    node.next = level.get(i + 1);
                }
                if (node.left != null) {
                    nextLevel.add(node.left);
                }
                if (node.right != null) {
                    nextLevel.add(node.right);
                }
            }
            level = nextLevel;
        }
        return root;
    }
}
