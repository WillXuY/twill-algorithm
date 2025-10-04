from abc import ABC, abstractmethod
from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class RemoveDuplicatesFromSortedList(ABC):
    """
    Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
    """
    @abstractmethod
    def delete_duplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        """
        Args:
            node:
                - The number of nodes in the list is in the range [0, 300].
                - -100 <= Node.val <= 100
                - The list is guaranteed to be sorted in ascending order.

        """
        pass

class RemoveDuplicatesFromSortedListLoop(RemoveDuplicatesFromSortedList):
    def delete_duplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        current = head
        while current and current.next:
            if current.val == current.next.val:
                current.next = current.next.next
            else:
                current = current.next
        return head
