class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<n;i++){
            res.add(-1);
        }
        for(int i=n-1;i>=0;i--){
            while(!stk.isEmpty()&&stk.peek()<=arr[i]){
                stk.pop();
            }
            if(!stk.isEmpty()){
                res.set(i,stk.peek());
            }
            stk.push(arr[i]);
        }
        return res;
    }
}
