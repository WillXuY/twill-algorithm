import sys, os
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '../../..')))
import pytest

from common.provide.list_node import ListNode, to_list_node
from add_two_numbers import AddTwoNumbersLoop

# 添加一个辅助函数来比较两个链表是否相等
def compare_list_nodes(node1: ListNode, node2: ListNode) -> bool:
    while node1 and node2:
        if node1.val != node2.val:
            return False
        node1 = node1.next
        node2 = node2.next
    # 如果两者都到达链表末尾，则相等，否则不相等
    return node1 is None and node2 is None

@pytest.mark.parametrize("l1, l2, expected", [
    (to_list_node([2, 4, 9]), to_list_node([5, 6, 4, 9]), to_list_node([7, 0, 4, 0, 1])),
    (to_list_node([2, 4, 3]), to_list_node([5, 6, 4]), to_list_node([7, 0, 8])),
    (to_list_node([0]), to_list_node([0]), to_list_node([0])),
    (to_list_node([9, 9, 9, 9, 9, 9, 9]), to_list_node([9, 9, 9, 9]), to_list_node([8, 9, 9, 9, 0, 0, 0, 1]))
])
def test_add_two_numbers(l1, l2, expected):
    loop = AddTwoNumbersLoop()
    result = loop.add_two_numbers(l1, l2)
    assert compare_list_nodes(result, expected)
