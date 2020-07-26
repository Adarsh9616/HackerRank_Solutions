

    // Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) 
    {
        if(position==0)
        {
            SinglyLinkedListNode t=new SinglyLinkedListNode(data);
            t.next=head;
            head=t;
            return head;
        }
        int p=1;
        SinglyLinkedListNode cur=head;
        while(p<position&&cur.next!=null)
        {
            cur=cur.next;
            p++;
        }
        if(cur.next==null)
        {
            SinglyLinkedListNode t=new SinglyLinkedListNode(data);
            t.next=null;
            cur.next=t;
            return head;
        }
        SinglyLinkedListNode t=new SinglyLinkedListNode(data);
        t.next=cur.next;
        cur.next=t;
        return head;
    }

