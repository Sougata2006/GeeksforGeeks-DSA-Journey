
class Solution {
  static int maxPathSumUtil(Node root,int[] res){
        if(root ==null)
        return 0;
        int l = Math.max(0,maxPathSumUtil(root.left,res));
        int r = Math.max(0,maxPathSumUtil(root.right,res));
        
        res[0] =Math.max(res[0],l+r+root.data);
        
        return root.data+Math.max(l,r);
    }
    
    int findMaxSum(Node root) {
        int[] res ={root.data};
        maxPathSumUtil(root,res);
        return res[0];
    }
}
