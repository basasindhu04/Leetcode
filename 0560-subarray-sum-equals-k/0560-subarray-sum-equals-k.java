class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int pre = 0, count = 0;
        for(int i = 0;i<nums.length;i++){
            pre += nums[i];
            int target = pre - k;
            if(map.containsKey(target)) count += map.get(target);
            map.put(pre, map.getOrDefault(pre,0)+1);
        }
        return count;
    }
}