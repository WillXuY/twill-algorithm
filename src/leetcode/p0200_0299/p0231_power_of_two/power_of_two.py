from abc import ABC, abstractmethod

class PowerOfTwo(ABC):
    """
    Given an integer n, return true if it is a power of two. Otherwise, return false.
    An integer n is a power of two, if there exists an integer x such that n == 2^x.
    """
    @abstractmethod
    def isPowerOfTwo(self, n: int) -> bool:
        """
        Args:
            n:
                -2^31 <= n <= 2^31 - 1
        """
        pass

class PowerOfTwoBit(PowerOfTwo):
    def isPowerOfTwo(self, n: int) -> bool:
        if n <= 0:
            return False
        return (n & (n - 1)) == 0
