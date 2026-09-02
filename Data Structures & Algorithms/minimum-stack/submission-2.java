//make another stack for min value. and everytime when we push number in original stack, the minValue stack remember the minimum value at the moment. Just using min_val int is not enought because it will only hold one last result so every time when we pop() the original stack it will have a problem. 

class MinStack {

    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public MinStack() {
        this.mainStack = new Stack<>();
        this.minStack = new Stack<>();
    }
    
    public void push(int val) {
        mainStack.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
        } else {
            if(val <= minStack.peek()){
                minStack.push(val);
            }
        }
    }
    
    public void pop() {  
        if(mainStack.peek().equals(minStack.peek())){
            minStack.pop();
        }
         mainStack.pop();
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
