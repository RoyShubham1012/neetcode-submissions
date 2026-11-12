class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty() || s.isEmpty() || t.length() > s.length()) {
                return "";
    }
        Map<Character, Integer> tFreq = new HashMap<>();
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            tFreq.put(c, tFreq.getOrDefault(c, 0)+1);
        }
        Map<Character, Integer> windowFreq = new HashMap<>();

        int i = 0,j=0,formed=0;
        int minLength = Integer.MAX_VALUE;
        int startIndex = 0;
        //ADOBECODEBANC
        while(j<s.length()){
            char c = s.charAt(j);
            if (tFreq.containsKey(c)) {
                windowFreq.put(c, windowFreq.getOrDefault(c, 0) + 1);
                    if (windowFreq.get(c).equals(tFreq.get(c))) {
                        formed++;
                    }
            }
            while (formed == tFreq.size()) {
                if(j-i+1<minLength){
                    minLength= j-i+1;
                    startIndex = i;
                    }
                char removed = s.charAt(i);
                if (tFreq.containsKey(removed)) {
                    windowFreq.put(removed, windowFreq.get(removed) - 1);
                        if (windowFreq.get(removed) < tFreq.get(removed)) {
                                formed--;
                        }
                }
                i++;
            }
            j++;
        }
        return minLength==Integer.MAX_VALUE ? "":s.substring(startIndex, startIndex + minLength);
    }
}
