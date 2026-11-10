class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        x = {}
        for i in strs:
            key = ''.join(sorted(i))
            if key in x:
                x[key].append(i)
            else:
                x[key] = [i]
        return list(x.values())