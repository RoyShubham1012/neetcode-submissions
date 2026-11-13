class Solution {
    public boolean isValid(String s) {
        Deque<Character> bracket =  new ArrayDeque();
        Map<Character,Character> openClose = Map.of(')','(',']','[','}','{');
        for(char c: s.toCharArray()){
            if(openClose.containsValue(c))
                bracket.push(c);
            else if(openClose.containsKey(c) && bracket.peek()==openClose.get(c))
                bracket.pop();
            else
                return false;
        }
        if(bracket.isEmpty())
            return true;
        else    
            return false;
    }
}
