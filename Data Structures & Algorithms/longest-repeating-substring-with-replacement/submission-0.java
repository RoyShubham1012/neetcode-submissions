class Solution {
    public int characterReplacement(String s, int k) {
        int ans = 0;
        int n =s.length();
        for(char ch='A'; ch<='Z';ch++){
            int i=0,j=0,replaced=0;
            while(j<n){
                if(s.charAt(j)==ch){
                    j++;
                }
                else if(replaced<k){
                    j++;
                    replaced++;
                }
                else if(s.charAt(i)==ch){
                    i++;
                }
                else{
                    i++;
                    replaced--;
                }
                ans =  Math.max(ans,j-i);
            }
        }
        return ans;
    }  
}
