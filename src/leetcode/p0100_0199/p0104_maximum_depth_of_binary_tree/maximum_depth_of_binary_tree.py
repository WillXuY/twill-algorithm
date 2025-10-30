from abc import ABC, abstractmethod
from typing import Optional

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class MaximumDepthOfBinaryTree(ABC):
    """
    Given the root of a binary tree, return its maximum depth.
    A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
    """
    @abstractmethod
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        """
        Args:
            root:
                - The number of nodes in the tree is in the range [0, 10^4].
                - -100 <= Node.val <= 100
        """
        pass

class MaximumDepthOfBinaryTreeRecursive(MaximumDepthOfBinaryTree):
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        l = self.maxDepth(root.left)
        r = self.maxDepth(root.right)
        return max(l, r) + 1
