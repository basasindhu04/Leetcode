class Solution {
    public String evaluate(String s, List<List<String>> kn) {
        Map<String, String> map = new HashMap<>();
        for(int i=0;i<kn.size();i++){
            map.put(kn.get(i).get(0), kn.get(i).get(1));
        }
        //System.out.println(map);
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        String str = "";
        for(char ch:s.toCharArray()){
            
            if(ch=='('){
                flag = true;
                
            }else if(ch==')'){
                if(map.containsKey(str)){
                    sb.append(map.get(str));
                }else{
                    sb.append("?");
                }
                str="";
                flag = false;
            }else{
                if(flag){
                str += ch;
                }else{
                    sb.append(ch);
                }
            }

        }
        return sb.toString();
    }
}