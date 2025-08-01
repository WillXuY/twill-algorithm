import pytest
from palindrome_number import PalindromeNumberArray

@pytest.mark.parametrize("nums, target, expected", [
    (121, True),
    (-121, False),
    (10, False)
])
def test_is_palindrome(x, expected):
    solver = PalindromeNumberArray()
    result = solver.is_palindrome(x)
    assert result == expected