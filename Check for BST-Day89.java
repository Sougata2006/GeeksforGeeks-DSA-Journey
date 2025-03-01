
class Solution {
    boolean isBST(Node root) {
        
        Node curr = root;
        Node pre;
        int prevValue =Integer.MIN_VALUE;
        
        while(curr != null){
            if(curr.left==null){
                if(curr.data <= prevValue){
                    return false;
                }
                prevValue = curr.data;
                curr = curr.right;
            }
            else{
                pre=curr.left;
                while(pre.right != null && pre.right != curr){
                    pre=pre.right;
                }
                if(pre.right==null){
                    pre.right=curr;
                    curr=curr.left;
                }
                else{
                    pre.right=null;
                    if(curr.data<=prevValue){
                        return false;
                    }
                    prevValue=curr.data;
                    curr=curr.right;
                }
            }
        }
        return true;
    }
}
