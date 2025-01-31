class Solution {

    public static int findEquilibrium(int arr[]) {

    int prefSum = 0;
    int total =0;
        
    for (int ele :arr){
        total += ele;
    }
        for(int pivot = 0; pivot<arr.length; pivot++){
                
            int suffSum = total-prefSum - arr[pivot];
            if(prefSum == suffSum){
                return pivot;
                
            }
            prefSum += arr[pivot];
        }
           return -1;
    }
}
