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
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            } else {    
                if(stack.isEmpty()){
                    return false;
                }
                boolean match = (stack.peek() == '(' && s.charAt(i) == ')') ||
                        (stack.peek() == '{' && s.charAt(i) == '}') ||
                        (stack.peek() == '[' && s.charAt(i) == ']');
                if(!match){
                    return false;
                }
                stack.pop();
            }
        }
            return stack.isEmpty();
        }
    }

