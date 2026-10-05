class Solution 
{
    public int[] exclusiveTime(int n, List<String> logs) 
    {
        int[] time = new int[n];
        Stack<Pair> st = new Stack<>();

        for(String i : logs)
        {
            String[] l = i.split(":");

            if (l[1].equals("start"))
            {
                Pair p = new Pair();
                p.id = Integer.parseInt(l[0]);
                p.s = Integer.parseInt(l[2]);
                p.ct = 0;

                st.push(p);
            }
            else
            {
                Pair p = st.pop();

                int interval = Integer.parseInt(l[2]) - p.s + 1;
                int ti = interval - p.ct;
                time[p.id] += ti;

                if(st.size() > 0)
                {
                    st.peek().ct += interval;
                }
            }
        }
        return time;
    }

    public static class Pair{
        int id ; 
        int s ;
        int ct ;
    }
}