from abc import ABC, abstractmethod
from typing import List

class LongestCommonPrefix(ABC):
    """
    Write a function to find the longest common prefix string amongst an array of strings.

    If there is no common prefix, return an empty string "".
    """
    @abstractmethod
    def longest_common_prefix(self, strs: List[str]) -> str:
        """
        Args:
            - 1 <= strs.length <= 200
            - 0 <= strs[i].length <= 200
            - strs[i] consists of only lowercase English letters if it is non-empty.
        """
        pass


class LongestCommonPrefix1(LongestCommonPrefix):
    def longest_common_prefix(self, strs:List[str]) -> str:
        if not strs:  # 空数组
            return ""

        for i in range(len(strs[0])):  # 遍历第一个字符串的字符
            ch = strs[0][i]
            for s in strs[1:]:
                if i == len(s) or s[i] != ch:  # 越界或字符不相等
                    return strs[0][:i]
        return strs[0]

