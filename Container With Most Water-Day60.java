class Solution {

    public int maxWater(int arr[]) {
   
        int left = 0;
        int right = arr.length-1;
        int res = 0;
        
        while(left < right){
            int water = Math.min(arr[left],arr[right])*(right-left);
            res =Math.max(res,water);
            
            if(arr[left]<arr[right])
            left += 1;
            
            else
            right -=1;
        }
        return res;
    }
}
