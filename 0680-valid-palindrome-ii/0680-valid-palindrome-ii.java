class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length(), c =0;
        int l=0, r = n-1;
       while(l<r){
            if(s.charAt(l) != s.charAt(r)) return ispal(s,l+1,r) || ispal(s,l,r-1);
            l++;
            r--;
       }
       return true;
    }
    private static boolean ispal(String s, int l, int r){
         while(l<r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
       }
         return true;
}
    }
  