
class Solution {
    static boolean canAttend(int[][] arr) {
        
        int n = arr.length;
        
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        for(int i=0;i<n-1;i++){
            if(arr[i][1]>arr[i+1][0])
            return false;
        }
        return true;
    }
}
