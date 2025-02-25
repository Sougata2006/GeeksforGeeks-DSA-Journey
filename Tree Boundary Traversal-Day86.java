
class Solution {
    static boolean isLeaf(Node node){
        return node != null && node.left == null && node.right == null;
    }
    static void collectBoundaryLeft(Node root,ArrayList<Integer> res){
        if(root==null || isLeaf(root))
        return;
        
        res.add(root.data);
        if(root.left != null)
        collectBoundaryLeft(root.left,res);
        else
        collectBoundaryLeft(root.right,res);
    }
    static void collectLeaves(Node root,ArrayList<Integer> res){
       if(root==null)
       return;
       
       if(isLeaf(root)){
           res.add(root.data);
           return;
       }
       collectLeaves(root.left,res);
       collectLeaves(root.right,res);
    }
    static void collectBoundaryRight(Node root,ArrayList<Integer> res){
        if(root==null || isLeaf(root))
        return;
        
        
        ArrayList<Integer> temp = new ArrayList<>();
        Node curr=root;
        while(curr != null && !isLeaf(curr)){
            temp.add(curr.data);
            if(curr.right != null)
            curr = curr.right;
            else
            curr = curr.left;
        }
        for(int i=temp.size()-1;i>=0;i--)
        res.add(temp.get(i));
    }
    ArrayList<Integer> boundaryTraversal(Node node) {
        ArrayList<Integer> res = new ArrayList<>();
        if(node==null)
        return res;
        if(!isLeaf(node))
        res.add(node.data);
        collectBoundaryLeft(node.left,res);
        collectLeaves(node,res);
        collectBoundaryRight(node.right,res);
        return res;
    }
}
