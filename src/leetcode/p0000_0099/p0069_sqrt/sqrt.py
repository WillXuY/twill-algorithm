from abc import ABC, abstractmethod

class Sqrt(ABC):
    """
    Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
    You must not use any built-in exponent function or operator.
    For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
    """
    @abstractmethod
    def my_sqrt(self, x: int) -> int:
        """
        Args:
            x:
                0 <= x <= 2^31 - 1
        """
        pass

class SqrtBinarySearch(Sqrt):
    def my_sqrt(self, x: int) -> int:
        if x < 2:
            return x
        left, right = 1, x // 2
        while left <= right:
            mid = (left + right) // 2
            if mid * mid == x:
                return mid
            elif mid * mid < x:
                left = mid + 1
            else:
                right = mid - 1
        return right
