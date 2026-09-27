class Solution {
    public int addDigits(int num) {
        if(num < 10) return num;
        while(num >= 10){
            String str = String.valueOf(num);
            int sum =0;
            for(char ch:str.toCharArray()){
                sum += ch-'0';
            }
            num = sum;
        }
        return num;
    }
}