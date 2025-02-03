class Solution {
    public static int[] productExceptSelf(int arr[]) {
        
        int zeros =0;
        int idx = -1;
        int prod =1;
        int n = arr.length;
        for(int i =0; i<n; i++){
            if(arr[i] ==0){
                zeros++;
                idx=i;
            }
            else{
                prod *=arr[i];
            }
        }
        int[] res = new int[n];
        Arrays.fill(res,0);
        
        if(zeros ==0){
            for(int i=0;i<n;i++)
            res[i] = prod/arr[i];
        }
        else if(zeros == 1)
        res[idx] = prod;
        
        return res;
    }
}
