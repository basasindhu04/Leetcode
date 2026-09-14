class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
       Map<Integer, Integer> map = new HashMap<>();
      int left =0;
      long ans =0, csum =0;
      for(int i =0;i<k;i++){
        csum += arr[i];
        map.put(arr[i], map.getOrDefault(arr[i],0)+1);
      }
    if(map.size()==k) ans = csum;
    for(int right = k;right<arr.length;right++){
        map.put(arr[right], map.getOrDefault(arr[right],0)+1);
        map.put(arr[left], map.get(arr[left])-1);
        csum += arr[right];
        csum -= arr[left];
       
        if(map.get(arr[left])==0) map.remove(arr[left]);
         left++;
     if(map.size()==k) ans = Math.max(csum,ans);
      }
      return ans;
    }
}