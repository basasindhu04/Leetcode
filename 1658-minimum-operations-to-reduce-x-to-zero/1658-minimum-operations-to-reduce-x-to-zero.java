class Solution {
    public int minOperations(int[] nums, int x) {
      int n = nums.length, sum =0;
      for(int i :nums){
        sum += i;
      }
      int target = sum -x;
      if(target < 0) return -1;
      if(target ==0) return n;
      int cur =0, maxLen = -1, left = 0;
      for(int right = 0;right <n;right++){
        cur += nums[right];
        while(cur > target && left <= right){
            cur -= nums[left];
            left++;
        }
        if(target == cur) maxLen = Math.max(maxLen, right-left+1);
      }
      return maxLen==-1?-1:n-maxLen;
        
    }
}