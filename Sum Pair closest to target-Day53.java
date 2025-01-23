class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        
        int n = arr.length;
        Arrays.sort(arr);
        List <Integer> res = new ArrayList <>();
        int minDiff = Integer.MAX_VALUE;
        
        int left = 0, right =n-1;
        
        while (left < right){
            int currSum = arr[left]+arr[right];
            
            if(Math.abs(target -currSum)< minDiff){
                minDiff = Math.abs(target-currSum);
                res =Arrays.asList(arr[left],arr[right]);
            }
            
            if(currSum < target)
            left++;
            
            else if(currSum > target)
            right--;
            
            else
            return res;
            
        }
        return res;
    }
}
