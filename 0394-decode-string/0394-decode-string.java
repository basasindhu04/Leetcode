class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();

        String cur = "";
        int count =0;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                count = count*10 + (ch-'0');
            }else if(ch=='['){
                numStack.push(count);
                strStack.push(cur);
                count =0;
                cur = "";
            }else if(ch==']'){
                int rep = numStack.pop();
                String prev = strStack.pop();
                StringBuilder sb = new StringBuilder(prev);
                while(rep-- >0){
                    sb.append(cur);
                }
                cur = sb.toString();
            }else{
                cur += ch;
            }
        }
        return cur;
    }
}