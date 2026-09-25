class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(s.length() < p.length()) return ans;
        Map<Character, Integer> pmap = new HashMap<>();
        Map<Character,Integer> windowMap = new HashMap<>();
        for(char ch:p.toCharArray()){
            pmap.put(ch, pmap.getOrDefault(ch,0)+1);
        }
        int k = p.length();
        for(int i =0;i<k;i++){
            char ch = s.charAt(i);
            windowMap.put(ch,windowMap.getOrDefault(ch,0)+1);
        }
        if(pmap.equals(windowMap)){
            ans.add(0);
        }
        for(int i =k;i<s.length();i++){
            char newCh = s.charAt(i);
            windowMap.put(newCh,windowMap.getOrDefault(newCh,0)+1);

            char oldCh = s.charAt(i-k);
            if(windowMap.get(oldCh) == 1){
                windowMap.remove(oldCh);
            }else{
                windowMap.put(oldCh, windowMap.get(oldCh)-1);
            }
            if(pmap.equals(windowMap))  ans.add(i-k+1);
        }
        return ans;
    }
}