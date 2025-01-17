class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {

        Set <Integer> st = new HashSet <>();
        int res = 0;
        
        for(int val : arr)
        st.add(val);
        
        for(int val : arr){
            
            if (st.contains(val) && !st.contains(val-1)){
                
                int cur = val , cnt = 0;
                while(st.contains(cur)){
                    
                    st.remove(cur);
                    cur++;
                    cnt++;
                }
                res = Math.max(res,cnt);
            }
        }
        return res;
        
    }
}
