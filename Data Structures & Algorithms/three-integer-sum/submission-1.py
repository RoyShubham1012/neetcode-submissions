class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        output = []
        n = len(nums)
        nums.sort()  #-4 -1 -1 0 1 2
        i=0
        for i in range(n-2):
            if i>0 and nums[i] == nums[i-1]:
                continue
            j=i+1
            k=n-1
            while j<k:
                current = -(nums[i])
                if current == nums[j]+ nums[k]:
                    output.append([nums[i],nums[j],nums[k]])
                    k-=1
                    j+=1
                    while nums[j] == nums[j-1] and j<k:
                        j+=1
                elif nums[j]+nums[k]< current:
                    j+=1
                else:
                    k-=1
        return output
                
