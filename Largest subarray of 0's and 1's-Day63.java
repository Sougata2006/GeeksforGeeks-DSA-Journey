class Solution {
    public int maxLen(int[] arr) {
        // Your code here
        
        HashMap <Integer,Integer> mp = new HashMap<>();
        
        int prefSum = 0, res =0;
        
        for(int i = 0; i< arr.length; i++){
            prefSum += (arr[i] ==0)? -1:1;
            
            if(prefSum == 0)
            res = i+1;
            
            if(mp.containsKey(prefSum))
            res = Math.max(res, i-mp.get(prefSum));
            
            else 
            mp.put(prefSum , i);
        }
        return res;
    }
}
