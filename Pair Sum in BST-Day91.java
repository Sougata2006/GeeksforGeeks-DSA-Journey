class Solution {
    static void inorderTraversal(Node root,ArrayList<Integer> inorder){
        if(root==null)
            return;
            
            inorderTraversal(root.left,inorder);
            inorder.add(root.data);
            inorderTraversal(root.right,inorder);
    }
    boolean findTarget(Node root, int target) {
        ArrayList<Integer> inorder = new ArrayList<>();
        inorderTraversal(root,inorder);
        int left=0,right=inorder.size()-1;
        
        while(left<right){
            int currentSum = inorder.get(left)+inorder.get(right);
        if(currentSum == target)
        return true;
        
        if(currentSum<target)
        left++;
        
        else
        right--;
    }
    return false;
}
}
