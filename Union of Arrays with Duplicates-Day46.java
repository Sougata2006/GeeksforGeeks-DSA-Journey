class Solution {
    public static int findUnion(int a[], int b[]) {
 
        int ans = 0;
        HashMap<Integer , Integer> mm = new HashMap<>();
        for(int x:a){
            if(mm.get(x) == null) ans++;
            mm.put(x,1);
        }
        for(int x:b){
            if(mm.get(x) == null)ans++;
            mm.put(x,1);
        }
        return ans;
        
    }
}
