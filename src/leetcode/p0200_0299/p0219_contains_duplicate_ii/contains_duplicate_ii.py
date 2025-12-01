from abc import ABC, abstractmethod
from typing import List

class ContainsDuplicateIi(ABC):
    """
    Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
    """
    @abstractmethod
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        """
        Args:
            nums:
                - 1 <= nums.length <= 10^5
                - -10^9 <= nums[i] <= 10^9
            k:
                0 <= k <= 10^5
        """
        pass

class ContainsDuplicateIiHash(ContainsDuplicateIi):
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        index_map: dict[int, int] = {}
        for i, num in enumerate(nums):
            if num in index_map and i - index_map[num] <= k:
                return True
            index_map[num] = i
        return False
