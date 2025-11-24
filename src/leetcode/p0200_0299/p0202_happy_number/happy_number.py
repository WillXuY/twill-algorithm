from abc import ABC, abstractmethod

class HappyNumber(ABC):
    """
    Write an algorithm to determine if a number n is happy.
    A happy number is a number defined by the following process:
    - Starting with any positive integer, replace the number by the sum of the squares of its digits.
    - Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
    - Those numbers for which this process ends in 1 are happy.
    Return true if n is a happy number, and false if not.
    """
    @abstractmethod
    def isHappy(self, n: int) -> bool:
        """
        Args:
            n:
                1 <= n <= 2^31 - 1
        """
        pass

class HappyNumberHash(HappyNumber):
    def isHappy(self, n: int) -> bool:
        def get_next(number):
            total_sum = 0
            while number > 0:
                number, digit = divmod(number, 10)
                total_sum += digit ** 2
            return total_sum

        seen = set()
        while n != 1 and n not in seen:
            seen.add(n)
            n = get_next(n)

        return n == 1
