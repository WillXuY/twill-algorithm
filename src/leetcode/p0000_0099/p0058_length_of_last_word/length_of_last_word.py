from abc import ABC, abstractmethod

class LengthOfLastWord(ABC):
    """
    Given a string s consisting of words and spaces, return the length of the last word in the string.

    A word is a maximal substring consisting of non-space characters only.
    """
    @abstractmethod
    def lengthOfLastWord(self, s: str) -> int:
        """
        Args:
            s:
                1 <= s.length <= 10^4
                s consists of only English letters and spaces ' '.
                There will be at least one word in s.
        """
        pass
