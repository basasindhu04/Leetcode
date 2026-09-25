class Solution {
    private static int count(String s, int l, int r){
       int c =0;
       while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
        c++;
        r++;
        l--;
       }
       return c;
    }
    public int countSubstrings(String s) {
        int ans =0;
        for(int i =0;i<s.length();i++){
            ans += count(s,i,i);
            ans += count(s,i,i+1);
        }
        return ans;
    }
}