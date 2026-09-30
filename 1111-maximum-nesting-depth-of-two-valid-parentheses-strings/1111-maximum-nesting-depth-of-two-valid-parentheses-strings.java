class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] ans = new int[n];
        int count = 0;
        for(int i =0;i<n;i++){
            if(seq.charAt(i) == '('){
                count++;
                 ans[i] =count %2;
            }else{
                  ans[i] = count %2;
                count--;
               
            }
        }
        return ans;
    }
}