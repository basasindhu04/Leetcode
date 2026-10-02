class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate(list, new StringBuilder(), 0,0,n);
        return list;
    }
    private static void generate(List<String> ans, StringBuilder curr, int open, int close, int max ){
        if(curr.length() == 2*max){
            ans.add(curr.toString());
            return;
        }

        if(open < max){
            curr.append('(');
            generate(ans, curr, open +1, close, max);
            curr.deleteCharAt(curr.length()-1);
        }


        if(close < open){
            curr.append(')');
            generate(ans, curr, open, close+1, max);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}