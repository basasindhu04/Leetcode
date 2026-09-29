class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum =0, n = arr.length ;
        for(int i =0;i<n;i++){
            int count = ((i+1) * (n-i) +1)/2;
            sum += count*arr[i];
        }
        return sum;
    }
}