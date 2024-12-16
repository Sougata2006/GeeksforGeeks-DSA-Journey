class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        
        int n = arr.length;
        int maxsum = arr[0];
        int result = arr[0];
        
        for(int i =1; i<n; i++){
            
            maxsum = Math.max((maxsum+arr[i]) , arr[i]);
        
        result = Math.max (result , maxsum);
        }
        return result;
    }
}
