from abc import ABC, abstractmethod
from typing import List

class MajorityElement(ABC):
    """
    Given an array nums of size n, return the majority element.
    The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
    """
    @abstractmethod
    def majorityElement(self, nums: List[int]) -> int:
        """
        Args:
            nums:
                - n == nums.length
                - 1 <= n <= 5 * 10^4
                - -10^9 <= nums[i] <= 10^9
        """
        pass

class MajorityElementSort(MajorityElement):
    def majorityElement(self, nums: List[int]) -> int:
        nums.sort()
        return nums[len(nums) // 2]
