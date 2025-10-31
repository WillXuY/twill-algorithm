from abc import ABC, abstractmethod
from typing import Optional, List

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class ConvertSortedArrayToBinarySearchTree(ABC):
    """
    Given an integer array nums where the elements are sorted in ascending order, convert it to a binary search tree.
    """
    @abstractmethod
    def sortedArrayToBST(self, nums: List[int]) -> Optional[TreeNode]:
        """
        Args:
            nums:
                - 1 <= nums.length <= 10^4
                - -10^4 <= nums[i] <= 10^4
                - nums is sorted in a strictly increasing order.
        """
        pass

class ConvertSortedArrayToBinarySearchTreeRecursive(ConvertSortedArrayToBinarySearchTree):
    def sortedArrayToBST(self, nums: List[int]) -> Optional[TreeNode]:
        def recursive(left, right):
            if left > right:
                return None
            mid = (left + right) // 2
            root = TreeNode(nums[mid])
            root.left = build(left, mid - 1)
            root.right = build(mid + 1, right)
            return root

        return recursive(0, len(nums) - 1)
