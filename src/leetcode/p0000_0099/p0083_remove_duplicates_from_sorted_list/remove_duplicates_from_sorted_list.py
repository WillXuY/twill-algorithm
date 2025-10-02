from abc import ABC, abstractmethod

class RemoveDuplicatesFromSortedList(ABC):
    """
    Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
    """
    @abstractmethod
    def delete_duplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        pass
