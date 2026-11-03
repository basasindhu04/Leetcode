class Solution {
    public int minMoves(int[] nums) {
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for(int i : nums){
            min = Math.min(i, min);
        }
        for(int i : nums){
            ans += Math.abs(i-min);
        }
        return ans;
    }
}