class Solution {
    public int minAddToMakeValid(String s) {
        int bal = 0;
        int ans = 0;
        for(int i = 0 ; i < s.length() ; i++)
        {   
            char ch = s.charAt(i);
            if(ch == '(')
            {
                bal++;
            }
            else
            {
                if(bal > 0)
                {
                    bal--;
                }else
                {
                    ans++;
                }
            }
        }
        ans += bal;
        return ans ;
    }
}