from abc import ABC, abstractmethod

class ExcelSheetColumnTitle(ABC):
    """
    Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
    """
    @abstractmethod
    def convertToTitle(self, columnNumber: int) -> str:
        """
        Args:
            columnNumber:
                1 <= columnNumber <= 2^31 - 1
        """
        pass

class ExcelSheetColumnTitleLoop(ExcelSheetColumnTitle):
    def convertToTitle(self, columnNumber: int) -> str:
        result = ""
        while columnNumber > 0:
            columnNumber -= 1
            result = chr(columnNumber % 26 + ord('A')) + result
            columnNumber //= 26
        return result
