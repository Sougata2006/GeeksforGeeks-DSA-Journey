class Solution {
    public int getSecondLargest(int[] arr) {
        
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        if(arr.length<2){
            return -1;
        }
        
        for (int num : arr){
            if (num>first){
                second = first;
                first=num;
            }
            else if(num>second && num != first){
                second = num;
            }
            
        }
        if(second == Integer.MIN_VALUE){
           return -1;
        }
        else{
            return second;
        }
        
    }
}
