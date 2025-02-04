class Solution {
    Node reverseList(Node head) {
       
        Stack <Node> stack = new Stack <>();
        
        Node temp = head;
        
        while (temp != null){
            stack.push(temp);
            temp = temp.next;
        }
        if (!stack.isEmpty()){
            head = stack.pop();
            temp =head;
            
            while (!stack.isEmpty()){
                temp.next=stack.pop();
                temp = temp.next; 
            }
            temp.next = null;
        }
        return head;
    }
}
