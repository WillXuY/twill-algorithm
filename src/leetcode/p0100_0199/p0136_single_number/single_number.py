from abc import ABC, abstractmethod
from typing import List

class SingleNumber(ABC):
    """
    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    You must implement a solution with a linear runtime complexity and use only constant extra space.
    """
    @abstractmethod
    def singleNumber(self, nums: List[int]) -> int:
        """
        Args:
            nums:
                - 1 <= nums.length <= 3 * 10^4
                - -3 * 10^4 <= nums[i] <= 3 * 10^4
                - Each element in the array appears twice except for one element which appears only once.
        """
        pass

class SingleNumberXor(SingleNumber):
    def singleNumber(self, nums: List[int]) -> int:
        result = 0
        for n in nums:
            result ^= n
        return result
