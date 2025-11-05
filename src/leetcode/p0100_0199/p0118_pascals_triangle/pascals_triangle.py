from abc import ABC, abstractmethod
from typing import List

class PascalsTriangle(ABC):
    """
    Given an integer numRows, return the first numRows of Pascal's triangle.
    In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
    """
    @abstractmethod
    def generate(self, numRows: int) -> List[List[int]]:
        """
        Args:
            numRows:
                1 <= numRows <= 30
        """
        pass

class PascalsTriangleLoop(PascalsTriangle):
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == 0:
            return []
        triangle = [[1]]

        for i in range(1, numRows):
            prev_row = triangle[i - 1]
            current_row = [1]

            for j in range(1, i):
                current_row.append(prev_row[j - 1] + prev_row[j])
            current_row.append(1)
            triangle.append(current_row)
        return triangle
