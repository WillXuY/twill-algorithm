from abc import ABC, abstractmethod
from typing import List, Optional

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class BinaryTreeInorderTraversal(ABC):
    """
    Given the root of a binary tree, return the inorder traversal of its nodes' values.
    """
    @abstractmethod
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        """
        Args:
            root:
                - The numver of nodes in the tree is in the range [0, 100]
                - -100 <= Node.val <= 100
        """
        pass
