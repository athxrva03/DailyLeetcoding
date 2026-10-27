class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];

        int l  = 0; 
        int mf = 0;
        int ml = 0;

        for(int r = 0 ; r < s.length() ; r++){
            char ch = s.charAt(r);
            freq[ch - 'A']++;

            mf  = Math.max(mf , freq[ch-'A']);
            while((r-l+1) - mf > k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            ml = Math.max(ml , r-l+1);
        }

        return ml;
    }
}