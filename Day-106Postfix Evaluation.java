class Solution {
    public int evaluate(String[] arr) {
        // code here
        Stack<Integer> stack = new Stack<>();
        for(String token : arr){
            if(token.matches("-?\\d+")){
                stack.push(Integer.parseInt(token));
            }
            else{
                int val1 = stack.pop();
                int val2 = stack.pop();
                switch(token){
                    case "+" : stack.push(val1+val2);
                    break;
                    case "-" : stack.push(val2-val1);
                    break;
                    case "*" : stack.push(val1*val2);
                    break;
                    case "/" : stack.push(val2/val1);
                    break;
                }
            }
        }
        return stack.pop();
    }
}
