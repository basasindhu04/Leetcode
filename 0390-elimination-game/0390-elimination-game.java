class Solution {
    public int lastRemaining(int n) {
        boolean LTR = true;
        int step = 1, head = 1, rem= n;
        while(rem > 1){
            if(LTR || rem % 2 != 0){
                head = head + step;
            }
            step = step *2;
            rem = rem /2;
            LTR = !LTR;
        }
        return head;
    
    }
}