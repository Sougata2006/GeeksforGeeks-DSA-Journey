class Solution {
    public Node cloneLinkedList(Node head) {

        if(head == null){
        return null;
        }
        
        Node curr = head;
        while(curr != null){
            Node newNode = new Node(curr.data);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }
        curr = head;
        while(curr != null){
            if(curr.random != null){
                curr.next.random = curr.random.next;
            }
        
        curr = curr.next.next;
    }
    curr = head;
    Node clonedHead = head.next;
    Node clone = clonedHead;
    while(clone.next != null){
        
        curr.next = curr.next.next;
        clone.next = clone.next.next;
        
        curr = curr.next;
        clone = clone.next;
    }
    curr.next = null;
    clone.next = null;
    
    return clonedHead;
    
    
    
    }
}
