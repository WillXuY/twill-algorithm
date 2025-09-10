from abc import ABC, abstractmethod

class FindTheIndexOfTheFirstOccurrenceInString(ABC):
    """
    Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
    """
    @abstractmethod
    def strStr(self, haystack: str, needle: str) -> int:
        """
        Args:
            haystack, needle:
                - 1 <= haystack.length, needle.length <= 10^4
                - haystack and needle consist of only lowercase English characters.

        """
        pass

class FindTheIndexOfTheFirstOccurrenceInStringBruteForce(FindTheIndexOfTheFirstOccurrenceInString):
    def strStr(self, haystack: str, needle: str) -> int:
        n, m = len(haystack), len(needle)
        if m == 0:
            return 0
        for i in range(n - m + 1):
            if haystack[i:i+m] == needle:
                return i
        return -1
