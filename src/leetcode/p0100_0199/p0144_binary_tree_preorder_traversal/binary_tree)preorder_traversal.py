from abc import ABC, abstractmethod
from typing import Optional, List

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class BinaryTreePreorderTraversal(ABC):
    """
    Given the root of a binary tree, return the preorder traversal of its nodes' values.
    """
    @abstractmethod
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        pass

class BinaryTreePreorderTraversalRecursive(BinaryTreePreorderTraversal):
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        result: List[int] = []
        self.recursive(root, result)
        return result

    def recursive(self, node: Optional[TreeNode], result: List[int]) -> None:
        if not node:
            return
        result.append(node.val)
        self.recursive(node.left, result)
        self.recursive(node.right, result)
