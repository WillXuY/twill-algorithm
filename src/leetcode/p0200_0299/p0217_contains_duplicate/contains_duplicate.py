from abc import ABC, abstractmethod
from typing import List

class ContainsDuplicate(ABC):
    """
    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
    """
    @abstractmethod
    def containsDuplicate(self, nums: List[int]) -> bool:
        """
        Args:
            nums:
                - 1 <= nums.length <= 10^5
                - -10^9 <= nums[i] <= 10^9
        """
        pass

class ContainsDuplicateSet(ContainsDuplicate):
    def containsDuplicate(self, nums: List[int]) -> bool:
        seen = set()
        for num in nums:
            if num in seen:
                return True
            seen.add(num)
        return False
