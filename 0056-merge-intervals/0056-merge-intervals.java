class Solution {
    public int[][] merge(int[][] inter) {
        int n = inter.length;
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(inter, (a,b) -> a[0] - b[0]);
        ans.add(inter[0]);
        for(int i =1;i<n;i++){
            int[] last = ans.get(ans.size()-1);
            if(last[1] >= inter[i][0]){
                last[1]=Math.max(last[1],inter[i][1]);
            }else{
                ans.add(inter[i]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}