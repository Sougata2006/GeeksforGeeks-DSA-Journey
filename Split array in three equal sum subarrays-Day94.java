class Solution {

    public List<Integer> findSplit(int[] arr) {
        List<Integer> res = new ArrayList<>();

        int n = arr.length;

        int total = 0;
        
        for(int i=0;i<n;i++){
            total += arr[i];
        }
        if(total%3 != 0){
            res.add(-1);
            res.add(-1);
            return res;
        } 
        int currSum = 0;
        int target = total /3;
        int count = 0;
        
        for(int i=0;i<n;i++){
            currSum += arr[i];
            
            if(currSum == target){
                res.add(i);
                currSum =0;

              count++;
              
                if(count == 2 && i<n-1){
                    return res;
                }
            }
        }
        res.clear();
        res.add(-1);
        res.add(-1);
        return res;
    }
}
