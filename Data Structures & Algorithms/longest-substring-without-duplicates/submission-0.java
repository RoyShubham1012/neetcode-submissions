class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int max =  0;
        Map<Character,Integer> sub = new HashMap();
        for(int right= 0 ; right<s.length(); right++){
            char c = s.charAt(right);
            if(sub.containsKey(c) && sub.get(c)>=left){
                left=sub.get(c)+1;
            }
            sub.put(c,right);
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}
