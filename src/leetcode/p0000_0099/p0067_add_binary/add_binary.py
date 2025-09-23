from abc import ABC, abstractmethod

class AddBinary(ABC):
    """
    Given two binary strings a and b, return their sum as a binary string.
    """
    @abstractmethod
    def add_binary(self, a: str, b: str) -> str:
        """
        Args:
            a:
                1 <= a.length <= 10^4
                consist only of '0' or '1' characters
            b:
                1 <= b.length <= 10^4
                consist only of '0' or '1' characters
        """
        pass
