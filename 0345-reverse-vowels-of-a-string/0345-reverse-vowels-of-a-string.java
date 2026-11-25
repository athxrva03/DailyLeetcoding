class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() -1;

         char[] chars = s.toCharArray();
    
        while(i < j){
            while(i < j && isNotVowel(chars[i])){
                i++;
            }
            while(j > i && isNotVowel(chars[j])){
                j--;
            }

            if(i < j){
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
        }

        return new String(chars);
    }

    public boolean isNotVowel(char ch){
        return ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && 
                ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U';
    }
}