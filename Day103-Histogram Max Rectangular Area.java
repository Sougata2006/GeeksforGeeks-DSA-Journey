class Solution {
    public static int getMaxArea(int arr[]) {
        // your code here
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        int res = 0, tp,curr;
        
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                tp = s.pop();
                int width = s.isEmpty()?i:i-s.peek()-1;
                res = Math.max(res,arr[tp]*width);
            }
            s.push(i);
        }
        while(!s.isEmpty()){
            tp = s.pop();
            curr = arr[tp]*(s.isEmpty()?n:n-s.peek()-1);
            res = Math.max(res,curr);
        }
        return res;
    }
}
