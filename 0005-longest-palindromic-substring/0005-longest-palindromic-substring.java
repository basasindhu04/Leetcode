class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n==1) return s;
        if(n==2) {
            if(s.charAt(0) != s.charAt(1)) return s.substring(0,1);
        }
        String ans = new String();
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                String str = s.substring(i,j+1);
                if(isPal(str)){
                    if(str.length() > ans.length()){
                        ans = str;
                    }
                }
            }
        }
        if(ans.length()==0) return s.substring(0,1);
        return ans;
    }
    private static boolean isPal(String s){
        int l =0, r= s.length()-1;
        while(l<r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}