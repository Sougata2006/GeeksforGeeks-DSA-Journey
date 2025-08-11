class gfg {
    void mirror(Node node) {
        
        if(node==null)
        return;
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        
        while(!queue.isEmpty()){
            Node curr = queue.poll();
            
            Node temp=curr.left;
            curr.left=curr.right;
            curr.right=temp;
            
            if(curr.left != null)
            queue.add(curr.left);
            if(curr.right !=null)
            queue.add(curr.right);
        }
    }
    static void levelOrder(Node root){
         if(root==null)
        return;
    
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            Node curr = queue.poll();
            
            if(curr==null)
                continue;
            
            System.out.print(curr.data+" ");
            queue.add(curr.left);
            queue.add(curr.right);
    }
    System.out.println();
}
}
