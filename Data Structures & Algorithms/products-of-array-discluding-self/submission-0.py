class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n= len(nums)
        prefix = [1]*n
        res= [1]*n
        for i in range(n):
            if i==0:
                prefix[i]=1
            else:
                prefix[i] = prefix[i-1]*nums[i-1]
        t=1
        for i in range(n-1,-1,-1):
            res[i] *=t
            t *=nums[i]
        for i in range(n):
            res[i] = res[i]*prefix[i]
        return res