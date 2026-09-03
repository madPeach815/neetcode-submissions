class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> stack = new Stack<>();
        int result = 0;
        int val1 = 0;
        int val2 = 0;

       for(String token : tokens){
        switch(token){
            case "+": 
            val2 = stack.pop();
            val1 = stack.pop();
            result = val1 + val2; 
            stack.push(result);
            break;

            case "-":
            val2 = stack.pop();
            val1 = stack.pop();
            result = val1 - val2; 
            stack.push(result);
            break;

            case "*":
            val2 = stack.pop();
            val1 = stack.pop();
            result = val1 * val2;
            stack.push(result); 
            break;

            case "/":
            val2 = stack.pop();
            val1 = stack.pop();
            result = val1 / val2;
            stack.push(result); 
            break;
            
            default:
            stack.push(Integer.parseInt(token));
            break;
        }
       } 
       return stack.peek();
    }
}
