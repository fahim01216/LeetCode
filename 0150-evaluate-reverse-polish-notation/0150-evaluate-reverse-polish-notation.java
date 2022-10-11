class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < tokens.length; i++) {
            if(tokens[i].equals("+")) {
                int val = st.pop() + st.pop();
                st.push(val);
            }
            
            else if(tokens[i].equals("-")) {
                int b = st.pop();
                int a = st.pop();
                int val = a - b;
                st.push(val);
            }
            
            else if(tokens[i].equals("*")) {
                int val = st.pop() * st.pop();
                st.push(val);
            }
            
            else if(tokens[i].equals("/")) {
                int b = st.pop();
                int a = st.pop();
                int val = a / b;
                st.push(val);
            }
            
            else {
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.peek();
    }
}