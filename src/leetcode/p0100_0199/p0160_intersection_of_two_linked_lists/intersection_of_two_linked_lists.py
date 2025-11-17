from abc import ABC, abstractmethod
from typing import Optional

class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class IntersectionOfTwoLinkedList(ABC):
    @abstractmethod
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        pass
