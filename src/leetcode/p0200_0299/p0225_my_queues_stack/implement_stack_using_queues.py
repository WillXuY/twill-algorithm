from abc import ABC, abstractmethod

"""
Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).

Notes:
    - You must use only standard operations of a queue, which means that only push to back, peek/pop from front, size and is empty operations are valid.
    - Depending on your language, the queue may not be supported natively. You may simulate a queue using a list or deque (double-ended queue) as long as you use only a queue's standard operations.

- At most 100 calls will be made to push, pop, top, and empty.
- All the calls to pop and top are valid.
"""
class ImplementStackUsingQueues(ABC):
    @abstractmethod
    def push(self, x: int) -> None:
        """
        Pushes element x to the top of the stack.
        Args:
            x:
                1 <= x <= 9
        """
        pass

    @abstractmethod
    def pop(self) -> int:
        """
        Removes the element on the top of the stack and returns it.
        """
        pass

    @abstractmethod
    def top(self) -> int:
        """
        Returns the element on the top of the stack.
        """
        pass

    @abstractmethod
    def empty(self) -> bool:
        """
        Returns true if the stack is empty, false otherwise.
        """
        pass
