class Solution 
{

    public int toDay(String date){
        int[] days = { 31 , 28 , 31 , 30 , 31 , 30, 31 , 31 , 30 , 31 , 30 , 31 };

        int m = Integer.parseInt(date.substring(0 , 2));
        int d = Integer.parseInt(date.substring(3));

        for(int i  = 0 ; i < m -1 ; i++){
            d += days[i];
        }
        return d;
    }

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) 
    {
        int aliceSt = toDay(arriveAlice);
        int aliceEnd  = toDay(leaveAlice);

        int bobSt = toDay(arriveBob);
        int bobEnd = toDay(leaveBob);

        int st = Math.max(aliceSt , bobSt);
        int end = Math.min(aliceEnd , bobEnd);

        if(st > end){
            return 0;
        }
        return end - st + 1;
    }
}