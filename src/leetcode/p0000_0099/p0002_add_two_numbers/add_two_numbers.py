from abc import ABC, abstractmethod
from typing import Optional
from common.provide.list_node import ListNode

class AddTwoNumbers(ABC):
    """
    You are given two non-empty linked lists representing two
    non-negative integers. The digits are stored in reverse order, and
    each of their nodes contains a single digit. Add the two numbers and
    return the sum as a linked list.

    You may assume the two numbers do not contain any leading zero,
    except the number 0 itself.
    """
    @abstractmethod
    def add_two_numbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        """
        Args:
            l1,l2: (Optional[ListNode]):
                - The number of nodes in each linked list in the range [1, 100].
                - Element range: 0 <= Node.val <= 9

        Returns:
            Optional[ListNode]: It is guaranteed that the list represents
                    a number that does not have leading zeros.
        """
        pass

class AddTwoNumbersLoop(AddTwoNumbers):
    def add_two_numbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        output_head = ListNode()
        current = output_head
        carry = 0

        while l1 or l2 or carry:
            val1 = l1.val if l1 else 0
            val2 = l2.val if l2 else 0
            total = val1 + val2 + carry
            carry = total // 10
            current.next = ListNode(total % 10)
            current = current.next
            if l1:
                l1 = l1.next
            if l2:
                l2 = l2.next

        return output_head.next
