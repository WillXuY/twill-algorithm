from abc import ABC, abstractmethod

class ClimbingStairs(ABC):
    """
    You are climbing a staircase. It takes n steps to reach the top.
    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
    """
    @abstractmethod
    def climb_stairs(self, n: int) -> int:
        """
        Args:
            n:
                1 <= n <= 45
        """
        pass

class ClimbingStairsDp(ClimbingStairs):
    def climb_stairs(self, n: int) -> int:
        if n <= 2:
            return n
        dp = [0] * (n + 1)
        dp[1], dp[2] = 1, 2
        for i in range(3, n + 1):
            dp[i] = dp[i - 1] + dp[i - 2]
        return dp[n]
