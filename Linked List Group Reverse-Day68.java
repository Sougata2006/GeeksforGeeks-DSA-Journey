class Solution {
    
    private static int getLength(Node head){
        int length = 0;
        Node curr = head;
        while(curr != null){
            length++;
            curr = curr.next;
        }
        return length;
    }
    public static Node reverseKGroup(Node head, int k) {

        int len = getLength(head);
        Node origH = null;
        Node origT = null;
        Node tmpH = null;
        Node tmpT = null;
        Node curr = head;
        
        while(len > 0){
            int j = k;
            j=Math.min(j,len);
            while(j>0){
                Node nex = curr.next;
                if(tmpH==null){
                    tmpH = curr;
                    tmpT =curr;
                }
                else{
                    curr.next = tmpH;
                    tmpH=curr;
                }
                curr = nex;
                j--;
                len--;
            }
            if(origH == null){
                origH = tmpH;
                origT = tmpT;
            }
            else{
                origT.next=tmpH;
                origT = tmpT;
            }
            tmpH =null;
            tmpT =null;
        }
        origT.next = null;
        return origH;
    }
}
