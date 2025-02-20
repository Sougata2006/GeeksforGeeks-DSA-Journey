
class Solution {
    int height(Node root) {
       
        if(root==null)
        return 0;
        
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int depth=0;
        
        while(!q.isEmpty()){
            int levelSize =q.size();
            
            for(int i=0;i<levelSize;i++){
                Node curr=q.poll();
                
                if(curr.left != null)
                q.add(curr.left);
                
                if(curr.right!=null)
                q.add(curr.right);
            }
            depth++;
        }
        return depth-1 ;
    }
}
