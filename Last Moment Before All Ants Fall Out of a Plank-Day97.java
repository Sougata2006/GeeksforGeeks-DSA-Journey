class Solution {
    public int getLastMoment(int n, int left[], int right[]) {
        
        int  res=0;
        for(int i=0;i<left.length;i++){
            res=Math.max(res,left[i]);
        }
        for(int i=0;i<right.length;i++){
            res=Math.max(res,n-right[i]);
        }
        //Give the result
        return res;
    }
}
