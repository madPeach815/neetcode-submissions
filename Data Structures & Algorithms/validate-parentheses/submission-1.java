class Solution {

    //You are given a string s consisting of the follwing characters: '(', ')'. '{', '}', '[', ']'.
    //The input string s is valid if and only if: 
    //1. Every open bracket is closed by the same type of close bracket. 
    //2. Open brackets are closed in the correct order.
    //3. Every close bracket has a corresponding open bracket of the same type. 

    //return true if s is a valid string, and false otherwise. 
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(curr == '('){
                stack.push(')');
            }else if(curr == '{'){
                stack.push('}');
            }else if(curr == '['){
                stack.push(']');
            }else {
                //if stack is Empty that means there are no open bracket it starts     
                //with close bracket. 
                if(stack.isEmpty()){
                    return false;
                }
                //the open bracket and close bracket mismatch.
                if(curr != stack.peek()){
                    return false;
                }
                stack.pop();
            }
        }
        //We need to check is stack is empty. because if there are some left over 
        //stack that means we miss some brackets. 
        return stack.isEmpty();
    }
}

