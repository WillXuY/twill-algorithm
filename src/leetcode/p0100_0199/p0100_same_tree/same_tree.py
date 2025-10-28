from abc import ABC, abstractmethod
from typing import Optional

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class SameTree(ABC):
    """
    Given the roots of two binary trees p and q, write a function to check if they are the same or not.

    Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
    """
    @abstractmethod
    def is_same_tree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        """
        Args:
            p, q:
                - The number of nodes in both trees is in the range [0, 100].
                - -10^4 <= Node.val <= 10^4
        """
        pass

class SameTreeRecursive(SameTree):
    def is_same_tree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        if not p and not q:
            return True
        if not p or not q or p.val != q.val:
            return False

        left_same = self.is_same_tree(p.left, q.left)
        right_same = self.is_same_tree(p.right, q.right)
        return left_same and right_same
