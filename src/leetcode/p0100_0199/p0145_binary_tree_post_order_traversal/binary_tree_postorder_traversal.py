from abc import ABC, abstractmethod
from typing import List, Optional

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class BinaryTreePostorderTraversal(ABC):
    """
    Given the root of a binary tree, return the postorder traversal of its nodes' values.
    """
    @abstractmethod
    def postorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        """
        Args:
            root:
                - The number of the nodes in the tree is in the range [0, 100].
                - -100 <= Node.val <= 100
        """
        pass

class BinaryTreePostorderTraversalRecursive(BinaryTreePostorderTraversal):
    def postorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        result: List[int] = []
        self.recursive(root, result);
        return result

    def recursive(self, root: Optional[TreeNode], result: List[int]) -> None:
        if not root:
            return;
        self.recursive(root.left, result)
        self.recursive(root.right, result)
        result.append(root.val)
