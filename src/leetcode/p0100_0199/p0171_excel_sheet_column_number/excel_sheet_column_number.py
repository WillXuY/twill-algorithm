from abc import ABC, abstractmethod

class ExcelSheetColumnNumber(ABC):
    """
    Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
    """
    @abstractmethod
    def titleToNumber(self, columnTitle: str) -> int:
        """
        Args:
            columnTitle:
                - 1 <= columnTitle.length <= 7
                - columnTitle consists only of uppercase English letters.
                - columnTitle is in the range ["A", "FXSHRXW"].
        """
        pass

class ExcelSheetColumnNumberLoop(ExcelSheetColumnNumber):
    def titleToNumber(self, columnTitle: str) -> int:
        result = 0
        for c in columnTitle:
            n = ord(c) - ord('A') + 1
            result = result * 26 + n
        return result
