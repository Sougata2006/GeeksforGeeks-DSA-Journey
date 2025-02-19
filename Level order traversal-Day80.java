class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
    
        if(root==null){
            return new ArrayList<>();
        }
            Queue<Node> q = new LinkedList<>();
            ArrayList<ArrayList<Integer>> res=new ArrayList<>();
            
            q.add(root);
            int currLevel=0;
            
            while(!q.isEmpty()){
                int len = q.size();
                res.add(new ArrayList<>());
                
                for(int i=0;i<len;i++){
                    Node node=q.poll();
                    res.get(currLevel).add(node.data);
                    
                    if(node.left != null){
                        q.add(node.left);
                    }
                    if(node.right != null){
                        q.add(node.right);
                    }
                }
                    currLevel++;
        }
            return res;
    }
}
