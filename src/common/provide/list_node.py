class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def to_list_node(nums: list[int]) -> ListNode:
    output = ListNode()
    current = output
    for n in nums:
        current.next = ListNode(n)
        current = current.next
    return output.next
