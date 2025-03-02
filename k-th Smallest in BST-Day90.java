
class Solution {
    static int kthSmallestRecur(Node root,int[] k){
            if(root==null){
            return -1;
    }
           int left = kthSmallestRecur(root.left,k);
           if(left != -1){
               return left;
           }
           k[0]--;
           if(k[0]==0){
               return root.data;
           }
           return kthSmallestRecur(root.right,k);
}
    public int kthSmallest(Node root, int k) {
            int[] kRef = {k};
            return kthSmallestRecur(root,kRef);
        }
        
}

