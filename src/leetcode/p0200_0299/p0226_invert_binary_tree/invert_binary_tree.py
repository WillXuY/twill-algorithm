from abc import ABC, abstractmethod
from typing import Optional

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class InvertBinaryTree(ABC):
    """
    Given the root of a binary tree, invert the tree, and return its root.
    """
    @abstractmethod
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        """
        Args:
            root:
                - The number of nodes in the tree is in the range [0, 100].
                - -100 <= Node.val <= 100
        """
        pass

class InvertBinaryTreeRecursive(InvertBinaryTree):
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if not root:
            return None
        root.left, root.right = root.right, root.left
        self.invertTree(root.left)
        self.invertTree(root.right)
        return root
