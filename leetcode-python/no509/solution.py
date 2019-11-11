class Solution:
    def fib(self, n: int) -> int:
        if n <= 1:
            return n

        x, y, result = 0, 1, 0
        for i in range(2, n):
            result = x + y
            x = y
            y = result
        
        return result