from abc import ABC, abstractmethod
from typing import Optional

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class CountCompleteTreeNodes(ABC):
    """
    Given the root of a complete binary tree, return the number of the nodes in the tree.
    According to Wikipedia, every level, except possibly the last, is completely filled in a complete binary tree, and all nodes in the last level are as far left as possible. It can have between 1 and 2^h nodes inclusive at the last level h.
    Design an algorithm that runs in less than O(n) time complexity.
    """
    @abstractmethod
    def countNodes(self, root: Optional[TreeNode]) -> int:
        """
        Args:
            root:
                - The number of nodes in the tree is in the range [0, 5 * 10^4].
                - 0 <= Node.val <= 5 * 10^4
                - The tree is guaranteed to be complete.
        """
        pass
