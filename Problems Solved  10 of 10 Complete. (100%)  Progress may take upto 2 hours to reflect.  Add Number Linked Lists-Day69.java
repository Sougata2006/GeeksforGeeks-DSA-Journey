class Solution {
    static Node reverse (Node head){
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null){
            next =curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    static int countNodes(Node head){
        int len =0;
        Node curr =head;
        while(curr != null){
            len += 1;
            curr = curr.next;
        }
        return len;
    }
    static Node trimLeadingZero(Node head){
        while ( head != null && head.data ==0){
            head =head.next;
        }
        return (head == null ? new Node(0) : head);
    }
    static Node addTwoLists(Node num1, Node num2) {

        num1 = trimLeadingZero(num1);
        num2 = trimLeadingZero(num2);
        
        int len1 =countNodes(num1);
        int len2 =countNodes(num2);
        
        if(len1 < len2){
            return addTwoLists(num2 , num1);
        }
        int carry = 0;
        num1 = reverse(num1);
        num2 = reverse(num2);
        Node res = num1;
        
        while (num2 != null || carry != 0){
            num1.data += carry;
            
            if(num2 != null){
                num1.data += num2.data;
                num2 = num2.next;
            }
            carry = num1.data / 10;
            num1.data = num1.data % 10;
       
            if(num1.next == null && carry != 0){
                num1.next =new Node(0);
            }
            num1 = num1.next;
        }
        
        return reverse(res);
        
    }
}
