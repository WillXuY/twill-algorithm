from abc import ABC, abstractmethod
from typing import Optional

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class MinimumDepthOfBinaryTree(ABC):
    """
    Given a binary tree, find its minimum depth.
    The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
    Note: A leaf is a node with no children.
    """
    @abstractmethod
    def minDepth(self, root: Optional[TreeNode]) -> int:
        """
        Args:
            root:
                - The number of nodes in the tree is in the range [0, 10^5].
                - -1000 <= Node.val <= 1000
        """
        pass

class MinimumDepthOfBinaryTreeRecursive(MinimumDepthOfBinaryTree):
    def minDepth(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        left_depth = self.minDepth(root.left)
        right_depth = self.minDepth(root.right)

        if not root.left:
            return right_depth + 1
        if not root.right:
            return left_depth + 1

        return min(left_depth, right_depth) + 1
