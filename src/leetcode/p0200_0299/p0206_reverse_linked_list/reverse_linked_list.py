from abc import ABC, abstractmethod
from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class ReverseLinkedList(ABC):
    """
    Given the head of a singly linked list, reverse the list, and return the reversed list.
    """
    @abstractmethod
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        """
        Args:
            head:
                - The number of nodes in the list is the range [0, 5000].
                - -5000 <= Node.val <= 5000
        """
        pass

class ReverseLinkedListRecursive(ReverseLinkedList):
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return head
        last = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return last
