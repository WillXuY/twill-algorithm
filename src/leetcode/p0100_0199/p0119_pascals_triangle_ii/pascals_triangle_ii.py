from abc import ABC, abstractmethod
from typing import List

class PascalsTriangleIi(ABC):
    """
    Given an integer rowIndex, return the rowIndex^th (0-indexed) row of the Pascal's triangle.
    In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
    """
    @abstractmethod
    def getRow(self, rowIndex: int) -> List[int]:
        """
        Args:
            rowIndex:
                0 <= rowIndex <= 33
        """
        pass

class PascalsTriangleIiLoop(PascalsTriangleIi):
    def getRow(self, rowIndex: int) -> List[int]:
        row = [1] + [0] * rowIndex
        for i in range(1, rowIndex + 1):
            j = i
            while j > 0:
                row[j] = row[j] + row[j - 1]
                j -= 1
        return row
