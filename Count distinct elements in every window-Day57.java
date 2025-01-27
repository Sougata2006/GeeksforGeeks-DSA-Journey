class Solution {
   
    ArrayList<Integer> countDistinct(int arr[], int k) {

        int n = arr.length;
        ArrayList <Integer> res = new ArrayList<>();
        Map<Integer , Integer> freq = new HashMap <>();
        
        for(int i =0; i< k;i++){
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
        }
        res.add(freq.size());
        
        for (int i =k; i<n;i++){
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
            freq.put(arr[i-k],freq.get(arr[i-k])-1);
            
            if(freq.get(arr[i-k])==0){
                freq.remove(arr[i-k]);
            }
            res.add(freq.size());
        }
        return res;
    }
}
