class Solution {
    
    public Solution() {
        s=new Stack<>();
        minEle = -1;
    }
    // Add an element to the top of Stack
    private Stack<Integer> s;
    private int minEle;
    
    public void push(int x) {
        // code here
        if(s.isEmpty()){
            minEle = x;
            s.push(x);
        }
        else if(x<minEle){
            s.push(2*x-minEle);
            minEle = x;
        }
        else{
            s.push(x);
        }
    }

    // Remove the top element from the Stack
    public void pop() {
        
        // code here
        if(s.isEmpty())
            return;
        int top = s.pop();
        if(top<minEle){
            minEle = 2*minEle-top;
        }
    }

    // Returns top element of the Stack
        
    public int peek() {
        // code here
        if(s.isEmpty()){
            return -1;
        }
        int top = s.peek();
        return (minEle>top)?minEle:top;
    }

        
    // Finds minimum element of Stack
    public int getMin() {
        // code here
        if(s.isEmpty()){
            return -1;
        }
        return minEle;
    }
}
