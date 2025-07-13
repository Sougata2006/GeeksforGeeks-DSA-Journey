
class Solution {
    public ArrayList<Integer> maxOfMins(int[] arr) {
        // Your code here
        int n=arr.length;
        ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(n,0));
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> lenArr = new ArrayList<>(Collections.nCopies(n,0));
        
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                int top = s.pop();
                int windowSize = s.isEmpty()?i:i-s.peek()-1;
                lenArr.set(top,windowSize);
            }
            s.push(i);
        }
        while(!s.isEmpty()){
            int top = s.pop();
            int windowSize = s.isEmpty()?n:n-s.peek()-1;
            lenArr.set(top,windowSize);
        }       
        for(int i=0;i<n;i++){
            int windowSize = lenArr.get(i)-1;
            res.set(windowSize,Math.max(res.get(windowSize),arr[i]));
        }
        for(int i=n-2;i>=0;i--){
            res.set(i,Math.max(res.get(i),res.get(i+1)));
        }
        return res;
    }
}
