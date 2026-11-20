class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int n = s.length();
        Map<Character,Integer> map1 = new HashMap();
        Map<Character,Integer> map2 = new HashMap();
        for(int i=0;i<n;i++){
            if(map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i), map1.get(s.charAt(i))+1);
            }
            if(map2.containsKey(t.charAt(i))){
                map2.put(t.charAt(i), map2.get(t.charAt(i))+1);
            }
            map1.putIfAbsent(s.charAt(i), 1);
            map2.putIfAbsent(t.charAt(i), 1);
            
        }
        return map1.equals(map2);
    }
}
