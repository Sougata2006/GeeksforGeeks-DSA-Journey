class Solution {
    int countPairs(int arr[], int target) {
        
            Arrays.sort(arr);
            
            int left =0, right = arr.length-1;
            int cnt =0;
            
            while(left < right){
                int sum = arr[left] + arr[right];
                
                if(sum < target){
                    cnt += right-left;
                    left++;
                }
                else{
                    right--;
                }
            }
        return cnt;
    }
}
