class Solution {
    ArrayList<Integer> inOrder(Node root) {
        
        ArrayList<Integer> res = new ArrayList<>();
        Node curr = root;
        
        while (curr != null){
            if(curr.left == null){
                res.add(curr.data);
                curr=curr.right;
            }
            else {
                Node prev = curr.left;
                while(prev.right != null && prev.right != curr){
                    prev = prev.right;
                }
                if(prev.right == null){
                    prev.right=curr;
                    curr=curr.left;
                }
                else{
                    prev.right =null;
                    res.add(curr.data);
                    curr=curr.right;
                }
            }
        }
        return res;
    }
}
