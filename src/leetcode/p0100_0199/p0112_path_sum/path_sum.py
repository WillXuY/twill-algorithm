from abc import ABC, abstractmethod
from typing import Optional

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class PathSum(ABC):
    """
    Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
    A leaf is a node with no children.
    """
    @abstractmethod
    def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
        """
        Args:
            root:
                - The number of nodes in the tree is in the range [0, 5000].
                - -1000 <= Node.val <= 1000
                - -1000 <= targetSum <= 1000
        """
        pass

class PathSumRecursive(PathSum):
    def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
        if not root:
            return False
        if not root.left and not root.right:
            return targetSum == root.val
        left_has = self.hasPathSum(root.left, targetSum - root.val)
        right_has = self.hasPathSum(root.right, targetSum - root.val)
        return left_has or right_has
