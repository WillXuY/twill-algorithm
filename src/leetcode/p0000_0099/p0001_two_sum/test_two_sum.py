import pytest
from two_sum import TwoSumHashMap

@pytest.mark.parametrize("nums, target, expected", [
    ([2, 7, 11, 15], 9, [0, 1]),
    ([3, 2, 4], 6, [1, 2]),
    ([3, 3], 6, [0, 1]),
    ([1, 2, 3], 7, [-1, -1])
])
def test_two_sum(nums, target, expected):
    solver = TwoSumHashMap()
    result = solver.two_sum(nums, target)
    # for answer in any order
    assert result == expected or result == expected[::-1]
