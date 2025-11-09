from abc import ABC, abstractmethod

class ValidPalindrome(ABC):
    """
    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
    Given a string s, return true if it is a palindrome, or false otherwise.
    """
    @abstractmethod
    def isPalindrome(self, s: str) -> bool:
        """
        Args:
            s:
                - 1 <= s.length <= 2 * 10^5
                - consists only of printable ASCII characters.
        """
        pass

class ValidPalindromePointers(ValidPalindrome):
    def isPalindrome(self, s: str) -> bool:
        left, right = 0, len(s) - 1
        while left < right:
            while left < right and not s[left].isalnum():
                left += 1
            while left < right and not s[right].isalnum():
                right -= 1
            if left < right and s[left].lower() != s[right].lower():
                return False
            left += 1
            right -= 1
        return True
