class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int days[] = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        int prefix[] = new int[13];
        prefix[0] = 0;
        for(int i = 0;i<12;i++){
            prefix[i+1] = prefix[i] + days[i];
        }

        int aa = calc(arriveAlice, prefix);
        int la = calc(leaveAlice, prefix);
        int ab = calc(arriveBob, prefix);
        int lb = calc(leaveBob, prefix);
        return Math.max(0,  Math.min(la, lb)-  Math.max(aa, ab) + 1);

    }

    private static int  calc(String day, int prefix[]){
        int month = Integer.parseInt(day.substring(0,2));
        int date = Integer.parseInt(day.substring(3));
        return prefix[month-1] + date;
    }
}