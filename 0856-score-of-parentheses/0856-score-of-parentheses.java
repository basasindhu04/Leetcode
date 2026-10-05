class Solution {
    public int scoreOfParentheses(String s) {
        int c =0, score = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '('){
                c++;
            }else{
                c--;
                if(s.charAt(i-1) == '('){
                    score += 1<<c;
                }
            }
        }
        return score;
    }
}