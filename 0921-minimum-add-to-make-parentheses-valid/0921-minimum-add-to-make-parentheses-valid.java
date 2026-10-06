class Solution {
    public int minAddToMakeValid(String s) {
        int oc = 0, cc = 0;
        for(char ch:s.toCharArray()){
            if(ch == '(') oc++;
            else if(ch==')' && oc > 0){
                oc--;
            }else{
                cc++;
            }
        }
        return oc+cc;
    }
}