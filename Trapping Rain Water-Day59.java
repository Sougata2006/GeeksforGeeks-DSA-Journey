class Solution {
    public int maxWater(int arr[]) {

        Stack <Integer> st = new Stack <>();
        int res =0;
        
        for(int i = 0; i<arr.length; i++){
            while (!st.isEmpty() && arr[st.peek()] <arr[i]){
                int pop_height = arr[st.pop()];
                
                if(st.isEmpty())
                break;
                
                int distance = i-st.peek() -1;
                
                int water = Math.min(arr[st.peek()],arr[i]);
                
                water -= pop_height;
                
                res += distance*water;
                
                
            }
            st.push(i);
        }
        return res;
    }
}
