class Solution {
    public int longestOnes(int[] nums, int k) {
        int left =0, ans =0, zeroscount =0, maxLen =0;
        for(int right = 0;right<nums.length;right++){
            if(nums[right]==0) zeroscount++;
            while(zeroscount > k){
                if(nums[left]==0){
                    zeroscount--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right- left +1);
        }
        return maxLen;
    }
}