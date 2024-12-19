class Solution {
    int getMinDiff(int[] arr, int k) {
        
        int n = arr.length;
        Arrays.sort(arr);
        
        
        int result = arr[n-1] - arr[0];
        
        for(int i = 0; i<n-1 ;i++){
           
                
            int currentMax = Math.max(arr[i] + k, arr[n - 1] - k);
            int currentMin = Math.min(arr[0] + k, arr[i + 1] - k);
            
            if (currentMin < 0) 
            continue;
            
                result = Math.min(result, currentMax - currentMin);
            
        }
        return result;
        
    }
}
