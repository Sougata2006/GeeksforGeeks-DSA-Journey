class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        // Your code here
        
        Set <ArrayList<Integer>> resSet = new HashSet<>();
        int n = arr.length;
        Map<Integer,List<int[]>> mp = new HashMap<>();
        
        for(int i = 0;i<n;i++){
            for(int j = i+1; j<n;j++){
                mp.computeIfAbsent(arr[i] + arr[j], k-> new ArrayList<>()).add(new int[] {i,j});
            }
        }
        for(int i = 0; i<n;i++){
            
            int rem = -arr[i];
            if(mp.containsKey(rem)){
                List<int[]> pairs =mp.get(rem);
                for(int[] p : pairs){
                    
                    if(p[0] != i && p[1] != i){
                        ArrayList<Integer> curr =
                              new ArrayList<>(Arrays.asList(i,p[0],p[1]));
                              Collections.sort(curr);
                              resSet.add(curr);
                    }
                }
            }
        }
        return new ArrayList<>(resSet);
    }
}
