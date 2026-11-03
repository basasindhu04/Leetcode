class Solution {
    public int minMoves(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        for(int i:nums){
            ans += (nums[nums.length - 1] - i);
        }
        return ans;
    }
}