class Solution {
    static void printLevelOrder(Node root){
        if(root==null){
            System.out.print("N");
            return;
        }
        
        Queue<Node> qq=new LinkedList<>();
        qq.add(root);
        
        while(!qq.isEmpty()){
            Node curr=qq.poll();
            
            if(curr==null){
                System.out.print("N");
                continue;
            }
            
            System.out.print(curr.data+" ");
            if(curr.right != null || curr.left != null){
            qq.add(curr.left);
            qq.add(curr.right);
        }
    }
    }
    static Node buildTreeRecur(Map<Integer,Integer> mp,int[] preorder,int[] preIndex,int left,int right){
        if(left>right)
        return null;
        
        int rootVal = preorder[preIndex[0]];
        preIndex[0]++;
        
        Node root = new Node(rootVal);
        
        int index = mp.get(rootVal);
        
        root.left = buildTreeRecur(mp,preorder,preIndex,left,index-1);
        root.right=buildTreeRecur(mp,preorder,preIndex,index+1,right);
    
        return root;
    }
    
    public static Node buildTree(int inorder[], int preorder[]) {
      Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        mp.put(inorder[i],i);
        
        int[] preIndex ={0};
        return buildTreeRecur(mp,preorder,preIndex,0,inorder.length-1);
    }
}
