class Solution {
        // code here

    static boolean check(int[] arr, int k, int pageLimit) {
       
        int cnt = 1;
        int pageSum = 0;
        for(int i = 0; i < arr.length; i++) {
         
            if(pageSum + arr[i] > pageLimit) {
                cnt++;
                pageSum = arr[i];
            }
            else {
                pageSum += arr[i];
            }
        }
        
        return (cnt <= k);
    }

    static int findPages(int[] arr, int k) {
        
        if(k > arr.length)
            return -1;
        
        int lo = Arrays.stream(arr).max().getAsInt();
        int hi = Arrays.stream(arr).sum();
        int res = -1;
        
        while(lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            
            if(check(arr, k, mid)){
                res = mid;
                hi = mid - 1;
            }
            else {
                lo = mid + 1;
            }
        }
        
        return res;
    }
}
