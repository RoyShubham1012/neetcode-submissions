class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        myMap = set()
        for i in nums:
            if i in myMap:
                return True
            myMap.add(i) 
        return False

    
