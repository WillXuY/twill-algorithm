from abc import ABC, abstractmethod
from typing import List

class SearchInsertPosition(ABC):
    """
    Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

    You must write an algorithm with O(log n) runtime complexity.
    """
    @abstractmethod
    def searchInsert(self, nums: List[int], target: int) -> int:
        """
        Args:
            nums:
                1 <= nums.length <= 10^4
                -10^4 <= nums[i] <= 10^4
                nums contains distinct values sorted in ascending order.
            target:
                -10^4 <= target <= 10^4
        """
        pass
