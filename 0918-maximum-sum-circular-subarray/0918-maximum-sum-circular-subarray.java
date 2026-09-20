class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int gmax = nums[0], gmin = nums[0], cmax = 0, cmin = 0, total =0;
        for(int i =0;i<nums.length;i++){
            cmax = Math.max(cmax+nums[i], nums[i]);
            cmin = Math.min(cmin+nums[i], nums[i]);;

            gmax = Math.max(gmax, cmax);
            gmin = Math.min(gmin, cmin);

            total += nums[i];
        }
        if(gmax < 0) return gmax;
        return Math.max(total-gmin, gmax);
    }
}