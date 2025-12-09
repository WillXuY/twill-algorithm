from abc import ABC, abstractmethod
from typing import List

class SummaryRanges(ABC):
    """
    You are given a sorted unique integer array nums.
    A range [a,b] is the set of all integers from a to b (inclusive).
    Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
    Each range [a,b] in the list should be output as:
    - "a->b" if a != b
    - "a" if a == b
    """
    @abstractmethod
    def summaryRanges(self, nums: List[int]) -> List[str]:
        """
        Args:
            nums:
                - 0 <= nums.length <= 20
                - -2^31 <= nums[i] <= 2^31 - 1
                - All the values of nums are unique.
                - nums is sorted in ascending order.
        """
        pass

class SummaryRangesLoop(SummaryRanges):
    def summaryRanges(self, nums: List[int]) -> List[str]:
        if not nums:
            return []
        res = []
        start = nums[0]
        for i in range(1, len(nums)):
            if nums[i] != nums[i-1] + 1:
                if start == nums[i-1]:
                    res.append(str(start))
                else:
                    res.appnd(f"{start}->{nums[i-1]}")
                start = nums[i]
        if start == nums[-1]:
            res.append(str(start))
        else:
            res.append(f"{start}->{nums[-1]}")
        return res
