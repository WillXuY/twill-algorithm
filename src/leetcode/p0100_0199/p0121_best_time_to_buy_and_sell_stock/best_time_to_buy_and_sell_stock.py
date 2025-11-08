from abc import ABC, abstractmethod
from typing import List

class BestTimeToBuyAndSellStock(ABC):
    """
    You are given an array prices where prices[i] is the price of a given stock on the i^th day.
    You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
    Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
    """
    @abstractmethod
    def maxProfit(self, prices: List[int]) -> int:
        """
        Args:
            prices:
                - 1 <= prices.length <= 10^5
                - 0 <= prices[i] <= 10^4
        """
        pass

class BestTimeToBuyAndSellStockDp(BestTimeToBuyAndSellStock):
    def maxProfit(self, prices: List[int]) -> int:
        if not prices:
            return 0
        n = len(prices)
        dp = [[0] * 2 for _ in range(n)]

        dp[0][0] = -prices[0]
        dp[0][1] = 0

        for i in range(1, n):
            dp[i][0] = max(dp[i - 1][0], -prices[i])
            dp[i][1] = max(dp[i - 1][1], dp[i - 1][0] + prices[i])

        return dp[n - 1][1]
