from abc import ABC, abstractmethod
from typing import List, Dict

class TwoSum(ABC):
    """
    Given an array of integers nums and an integer target, return
    indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution, and
    you may not use the same element twice.

    You can return the answer in any order.
    """
    @abstractmethod
    def two_sum(self, nums: List[int], target: int) -> List[int]:
        """
        Args:
            nums: (List[int]):
                - Length: 2 <= nums.length <= 10^4
                - Element range: -10^9 <= nums[i] <= 10^9
            target: (int):
                - Range: -10^9 <= target <= 10^9

        Returns:
            List[int]: Only one valid answer exists.
        """
        pass

class TwoSumHashMap(TwoSum):
    def two_sum(self, nums: List[int], target: int) -> List[int]:
        # dict 类型实现 hash 表
        num_index_map: Dict[int, int] = {}
        for i, num in enumerate(nums):
            diff = target - num
            if diff in num_index_map:
                return [num_index_map[diff], i]
            num_index_map[num] = i
        return [-1, -1]
