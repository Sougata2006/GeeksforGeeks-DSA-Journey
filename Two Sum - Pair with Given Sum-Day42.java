class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        
        HashSet <Integer> set = new HashSet <>();
        
        for(int i = 0; i< arr.length; i++){
            int complement  = target - arr[i];
            
            if(set.contains(complement)){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
        
    }
}
