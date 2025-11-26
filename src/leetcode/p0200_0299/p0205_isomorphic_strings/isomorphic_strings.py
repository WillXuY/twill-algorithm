from abc import ABC, abstractmethod

class IsomorphicStrings(ABC):
    """
    Given two strings s and t, determine if they are isomorphic.
    Two strings s and t are isomorphic if the characters in s can be replaced to get t.
    All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
    """
    @abstractmethod
    def isIsomorphic(self, s: str, t: str) -> bool:
        """
        Args:
            s, t:
                - 1 <= s.length <= 5 * 10^4
                - t.length == s.length
                - s and t consist of any valid ascii character.
        """
        pass
