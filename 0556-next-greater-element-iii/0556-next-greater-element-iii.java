class Solution {
    public int nextGreaterElement(int num) {
        if(num < 10) return -1;
       char ch[] = String.valueOf(num).toCharArray();
       int n = ch.length;
       int arr[] = new int[n];
       for(int i =0;i<n;i++){
            arr[i] = ch[i] - '0';
       }

        int idx = -1;
        for(int i = n-2;i>=0;i--){
            if(arr[i] < arr[i+1]){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            reverse(arr, 0, n-1);
            long val = 0;
            for (int digit : arr) {
                val = val * 10 + digit;
            }
            if (val > Integer.MAX_VALUE) {
                return -1;
            }
             if(num>=val) return -1;
            return (int) val;
        }
        for(int i = n-1;i> idx;i--){
            if(arr[i] > arr[idx]){
                swap(arr, i, idx);
                break;
            }
        }
        reverse(arr, idx+1, n-1);
        
        long val = 0;
            for (int digit : arr) {
                val = val * 10 + digit;
            }
            if (val > Integer.MAX_VALUE) {
                return -1;
            }
            if(num>=val) return -1;
            return (int) val;
        
    }
    private static int[] swap(int[] arr, int s, int e){
        int t = arr[s];
        arr[s] = arr[e];
        arr[e] = t;
        return arr;
    }
    private static int[] reverse(int arr[], int s, int e){
        while(s<e){
            int t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
            s++;
            e--;
        }
        return arr;
    }
}