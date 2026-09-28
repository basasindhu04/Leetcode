class Solution {
    public String longestNiceSubstring(String s) {
        String sb = new String();
        int n = s.length();
        for(int i =0;i<n;i++){
            for(int j = i+1;j<n;j++){
                String str = s.substring(i,j+1);
                Set<Character> set = new HashSet<>();
                for(char ch:str.toCharArray()){
                    set.add(ch);
                }
                boolean flag = true;
                for(char ch:set){
                    if(set.contains(Character.toUpperCase(ch)) && set.contains(Character.toLowerCase(ch))){
                        flag = true;
                    }else{
                        flag = false;
                        break;
                    }
                }
                if(flag){
                   if(sb.length() < str.length()){
                    sb = str;
                   }
                }
            }
        }
        return sb.toString();
    }
}