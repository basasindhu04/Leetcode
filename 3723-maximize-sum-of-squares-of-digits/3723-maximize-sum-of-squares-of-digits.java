class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum > num*9 ) return "";
        StringBuilder sb = new StringBuilder("9".repeat(sum/9));
        if(sum%9 > 0) sb.append(sum%9);
        sb.append("0".repeat(num-sb.length()));
        return sb.toString();
    }
}