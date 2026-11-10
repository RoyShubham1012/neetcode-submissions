class Solution(object):
    def longestConsecutive(self, nums):
        nums.sort()      # 1 2 3 4 100 101
        count=1
        n= len(nums)
        if n>=1:
            max_count=1
        else:
            max_count=0
        x = set()
        for i in range(n-1):
            if nums[i+1]==nums[i]+1:
                count+=1
            elif nums[i+1] == nums[i]:
                pass
            elif nums[i+1]>nums[i]+1:
                count=1
            max_count = max(max_count,count)
        return max_count