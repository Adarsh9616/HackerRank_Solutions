

    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) 
    {
        if(head==null)
        {
            return null;
        }
        int count=0;
        DoublyLinkedListNode cur=head;
        while(cur.next!=null)
        {
            count++;
            cur=cur.next;
        }
        DoublyLinkedListNode cur1=head;
        DoublyLinkedListNode cur2=cur;
        count=count/2+1;
        while(count-->0)
        {
            int temp=cur1.data;
            cur1.data=cur2.data;
            cur2.data=temp;
            cur1=cur1.next;
            cur2=cur2.prev;
        }
        return head;


    }

