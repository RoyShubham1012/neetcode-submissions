class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        sumMap = {}
        for i in range(len(nums)):
            sumMap[nums[i]] = i
        for j in range(len(nums)):
            diff = target - nums[j]
            if diff in sumMap and sumMap[diff] != j:
                return [j,sumMap[diff]]
        