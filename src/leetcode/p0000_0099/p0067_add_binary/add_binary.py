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

class AddBinaryLoop(AddBinary):
    def add_binary(self, a: str, b: str) -> str:
        i, j = len(a) - 1, len(b) - 1
        carry = 0
        result = []

        while i >= 0 or j >= 0 or carry:
            total = carry
            if i >= 0:
                total += int(a[i])
                i -= 1
            if j >= 0:
                total += int(b[j])
                j -= 1
            result.append(str(total % 2))
            carry = total // 2
        return ''.join(reversed(result))
