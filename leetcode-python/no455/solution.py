class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        g.sort()
        s.sort()

        i, j = 0, 0
        g_length, s_length = len(g), len(s)
        while i < g_length and j < s_length:
            if g[i] <= s[j]:
                i += 1
            j += 1
        return i