
class LinkedListOps{
    public static LinkedListNode reverse(LinkedListNode head){
        if(head == null||head.next==null)
            return head;
        LinkedListNode pre = head;
        LinkedListNode cur = head.next;
        LinkedListNode next = cur.next;
        pre.next = null;
        while(next!=null){
            //System.out.println(cur.data);
            cur.next = pre;
            pre = cur;
            cur = next;
            next = next.next;
        }
        cur.next = pre;
        return cur;
    }
    
    public static LinkedListNode reverseR(LinkedListNode head){
        if(head==null||head.next==null)
            return head;
        LinkedListNode sec = head.next;
        head.next = null;
        LinkedListNode newHead = reverseR(sec);
        sec.next = head;
        return newHead;
    }

    public static void main(String[] args){
        LinkedListNode head = new LinkedListNode(0);
        LinkedListNode cur = head;
        for(int i=1; i<10 ; i++){
            //System.out.println(cur.data);
            cur.next = new LinkedListNode(i);
            cur = cur.next;
        }
        cur = reverseR(head);
        while(cur!=null){
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
}
        
