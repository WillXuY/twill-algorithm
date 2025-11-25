from abc import ABC, abstractmethod
from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class RemoveLinkedListElements(ABC):
    """
    Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
    """
    @abstractmethod
    def removeElements(self, head: Optional[ListNode], val: int) -> Optional[ListNode]:
        """
        Args:
            head:
                - The number of nodes in the list is in the range [0, 10^4].
                - 1 <= Node.val <= 50
            val:
                0 <= val <= 50
        """
        pass

class RemoveLinkedListElementsLoop(RemoveLinkedListElements):
    def removeElements(self, head: Optional[ListNode], val: int) -> Optional[ListNode]:
        dummy = ListNode(0, head)
        # 新建一个哑节点来解决可能存在的 head 节点的特殊处理
        current = dummy

        while current.next:
            # 判断需要删除的节点的值,不是 current.val
            if current.next.val == val:
                current.next = current.next.next
            # 在判断不需要删除节点后移动指针到下一个节点
            else:
                current = current.next

        # 哑节点的 next 是需要的 head
        return dummy.next
