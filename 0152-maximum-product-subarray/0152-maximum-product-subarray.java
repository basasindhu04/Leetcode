class Solution {
    public int maxProduct(int[] nums) {
     int ans =Integer.MIN_VALUE, pre =1, suf = 1, n = nums.length;
     for(int i =0;i<n;i++){
        if(pre == 0) pre = 1;
        if(suf == 0) suf = 1;
        pre *= nums[i];
        suf *= nums[n-i-1];
        ans = Math.max(ans, Math.max(pre, suf));
     }
     return ans;
    }
}