class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        x={}
        for i in nums:
            x[i] = x.get(i, 0) + 1
        y = sorted(x,key = lambda i : x[i], reverse =True)[:k]
        return y