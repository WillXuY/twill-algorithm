from abc import ABC, abstractmethod

class ValidParentheses(ABC):
    """
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    An input string is valid if:
        1. Open brackets must be closed by the same type of brackets.
        2. Open brackets must be closed in the correct order.
        3. Every close bracket has a corresponding open bracket of the same type.
    """
    @abstractmethod
    def is_valid(self, s: str) -> bool:
        """
        Args:
            - 1 <= s.length <= 10^4
            - s consists of parentheses only '()[]{}'.
        """
        pass


class ValidPatenthesesStack(ValidParentheses):
    def is_valid(self, s: str) -> bool:
        stack: list[str] = []

        mapping = {')':'(', ']':'[', '}':'{'}
        for c in s:
            if c in mapping:
                p = stack.pop() if stack else '#'
                if mapping[c] != p:
                    return False
            else:
                stack.append(c)

        return False
