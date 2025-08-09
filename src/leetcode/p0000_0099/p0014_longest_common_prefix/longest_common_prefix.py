from abc import ABC, abstractmethod
from typing import List, Dict

class LongestCommonPrefix(ABC):
    """
    Write a function to find the longest common prefix string
    amongst an array of strings.

    If there is no common prefix, return an empty string "".
    """
    @abstractmethod
    def longest_common_prefix(self, strs: List[str]) -> str:
        """
        Args:
            - 1 <= strs.length <= 200
            - 0 <= strs[i].length <= 200
            - strs[i] consists of only lowercase English letters if it is
              non-empty.
        """
        pass

class LongestCommonPrefixA(LongestCommonPrefix):
    def longest_common_prefix(self, strs: List[str]) -> str:
        pass
