class Solution {
    public void nextPermutation(int[] nums) {
        int idx = -1;
        int n = nums.length;
        for(int i = n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            reverse(nums, 0, n-1);
            return;
            
        }

        for(int i = n-1;i > idx;i--){
            if(nums[i] > nums[idx]){
                swap(nums, i, idx);
                break;
            }
        }
       reverse(nums, idx+1, n-1);

    }
    private void reverse(int[] nums, int le, int el){
            int l = le, e = el;
            while(l<e){
                int temp = nums[l];
                nums[l] = nums[e];
                nums[e] = temp;
                l++;
                e--;
            }
           
    }
     private void swap(int[] nums, int l , int e){
                int temp = nums[l];
                nums[l] = nums[e];
                nums[e] = temp;
        }
        
}