
class Solution {
    
    static int countPathsUtil(Node node,int k,int currSum,HashMap<Integer,Integer> prefSums){
        if(node ==null)
        return 0;
        
        int pathCount = prefSums.getOrDefault(currSum-k,0);
        currSum += node.data;
        
        if(currSum==k)
        pathCount++;
        
        pathCount = prefSums.getOrDefault(currSum-k,0);
        prefSums.put(currSum,prefSums.getOrDefault(currSum,0)+1);
        
        pathCount +=countPathsUtil(node.left,k,currSum,prefSums);
        pathCount +=countPathsUtil(node.right,k,currSum,prefSums);
        
        if(prefSums.get(currSum)==1)
        prefSums.remove(currSum);
        else
        prefSums.put(currSum,prefSums.get(currSum)-1);
        return pathCount;
        
    }
    int sumK(Node root,int k){
        HashMap<Integer,Integer> prefSums =new HashMap<>();
        prefSums.put(0,1);
        return countPathsUtil(root,k,0,prefSums);
    }
}
