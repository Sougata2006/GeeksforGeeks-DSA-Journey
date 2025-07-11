
class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // write code here
        
        int n = arr.length;
        ArrayList<Integer> span = new ArrayList<>(Collections.nCopies(n,0));
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<n;i++){
            while(!stk.isEmpty() && arr[stk.peek()] <= arr[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                span.set(i,(i+1));
            }
            else{
                span.set(i,(i-stk.peek()));
            }
            stk.push(i);
        }
        return span;
    }
}
