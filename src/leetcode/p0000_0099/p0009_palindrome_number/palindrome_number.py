from abc import ABC, abstractmethod
from typing import List, Dict

class PalindromeNumber(ABC):
    """
    Given an integer x, return true if x is a palindrome, and false otherwise.

    An integer is a palindrome when it reads the same forward and backward.
    For example, 121 is a palindrome while 123 is not.
    """
    @abstractmethod
    def is_palindrome(self, x: int) -> bool:
        """
        Args:
            -2^31 <= x <= 2^31 - 1
        """
        pass

class PalindromeNumberArray(PalindromeNumber):
    def is_palindrome(self, x: int) -> bool:
        pass
