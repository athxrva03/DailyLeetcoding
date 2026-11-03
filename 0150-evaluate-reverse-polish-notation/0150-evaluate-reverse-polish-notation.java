class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(int i = 0 ; i < tokens.length ; i++){
            if(tokens[i].equals("+")){
                Integer num1 = st.pop();
                Integer num2 = st.pop();
                st.push(num1 + num2);
            }else if (tokens[i].equals("-")){
                Integer num1 = st.pop();
                Integer num2 = st.pop();
                st.push(num2 - num1);
            }else if(tokens[i].equals("*")){
                Integer num1 = st.pop();
                Integer num2 = st.pop();
                st.push(num1 * num2);
            }else if(tokens[i].equals("/")){
                Integer num1 = st.pop();
                Integer num2 = st.pop();
                st.push(num2 / num1);
            }else{
                Integer num = Integer.valueOf(tokens[i]);
                st.push(num);
            }
        }
        return st.pop();
    }


}