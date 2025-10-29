from abc import ABC, abstractmethod
from typing import Optional

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class SymmetricTree(ABC):
    """
    Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
    """
    @abstractmethod
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        """
        Args:
            root:
                - The number of nodes in the tree is in the range [1, 1000].
                - -100 <= Node.val <= 100
        """
        pass

class SymmetricTreeRecursive(SymmetricTree):
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        if not root:
            return False
        return self.recursive(root.left, root.right)

    def recursive(self, left: TreeNode, right: TreeNode) -> bool:
        if not left and not right:
            return True
        if not left or not right:
            return False
        if left.val != right.val:
            return False
        return self.recursive(left.left, right.right) and self.recursive(left.right, right.left)
