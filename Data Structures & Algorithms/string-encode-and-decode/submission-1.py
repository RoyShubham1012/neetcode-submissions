class Solution:

    def encode(self, strs: List[str]) -> str:
        x = ''.join(str(len(s))+'%'+s for s in strs)
        return x

    def decode(self, s: str) -> List[str]:
        #5%hello
        main = []
        i = 0
        while i<len(s):
            j = s.find('%',i)
            l = int(s[i:j])
            word = s[j+1:j+1+l]
            main.append(word)
            i = j + 1 + l
        return main