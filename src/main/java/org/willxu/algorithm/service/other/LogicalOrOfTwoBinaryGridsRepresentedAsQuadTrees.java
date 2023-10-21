package org.willxu.algorithm.service.other;

import org.willxu.algorithm.provide.Node;

public interface LogicalOrOfTwoBinaryGridsRepresentedAsQuadTrees {
    /**
     * A Binary Matrix is a matrix in which all the elements are either
     * 0 or 1.
     * <p>
     * Given quadTree1 and quadTree2. quadTree1 represents a n * n
     * binary matrix and quadTree2 represents another n * n binary matrix.
     * <p>
     * Return a Quad-Tree representing the n * n binary matrix which is
     * the result of logical bitwise OR of the two binary matrixes
     * represented by quadTree1 and quadTree2.
     * <p>
     * Notice that you can assign the value of a node to True or False
     * when isLeaf is False, and both are accepted in the answer.
     * <p>
     * A Quad-Tree is a tree data structure in which each internal node
     * has exactly four children. Besides, each node has two attributes:
     * <p>
     * - val: True if the node represents a grid of 1's or False if the
     *   node represents a grid of 0's.
     * - isLeaf: True if the node is leaf node on the tree or False if
     *   the node has the four children.
     * <p>
     * class Node {
     *     public boolean val;
     *     public boolean isLeaf;
     *     public Node topLeft;
     *     public Node topRight;
     *     public Node bottomLeft;
     *     public Node bottomRight;
     * }
     * <p>
     * We can construct a Quad-Tree from a two-dimensional area using
     * the following steps:
     * <p>
     * 1. If the current grid has the same value (i.e all 1's or all 0's)
     *    set isLeaf True and set val to the value of the grid and set
     *    the four children to Null and stop.
     * 2. If the current grid has different values, set isLeaf to False
     *    and set val to any value and divide the current grid into four
     *    sub-grids as shown in the photo.
     * 3. Recurse for each of the children with the proper sub-grid.
     * <p>
     * If you want to know more about the Quad-Tree, you can refer to
     * the wiki.
     * <p>
     * Quad-Tree format:
     * <p>
     * The input/output represents the serialized format of a Quad-Tree
     * using level order traversal, where null signifies a path
     * terminator where no node exists below.
     * <p>
     * It is very similar to the serialization of the binary tree. The
     * only difference is that the node is represented as a list
     * [isLeaf, val].
     * <p>
     * If the value of isLeaf or val is True we represent it as 1 in the
     * list [isLeaf, val] and if the value of isLeaf or val is False we
     * represent it as 0.
     *
     * @param quadTree1,quadTree2 quadTree1 and quadTree2 are both valid
     *                            Quad-Trees each representing a n * n grid.
     *                            n == 2^x where 0 <= x <= 9.
     */
    Node intersect(Node quadTree1, Node quadTree2);
}
