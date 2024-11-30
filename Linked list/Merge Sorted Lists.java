class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val=val;
        this.next=null;
    }
}

class Linkedlist{
   

    public static ListNode creaListNode(int[] values){
       // ListNode head=new ListNode(0);
       ListNode head=null;
        for(int n:values){
            ListNode new_node= new ListNode(n);
            if(head==null){
                head=new_node;
            }
            else{
                ListNode curr=head;
                while(curr.next!=null) curr=curr.next;
                curr.next=new_node;
                curr=curr.next;
            }
        }
    return head;
    //return head.next;
    }

    public static ListNode merge(ListNode  l1,ListNode l2){
        ListNode head=new ListNode(0);
        ListNode curr= head;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val) {
                curr.next=l1;
                l1=l1.next;
            }
            else{
                curr.next=l2;
                l2=l2.next;
            }
            curr=curr.next;
        }

        if(l1!=null) curr.next=l1;
        else curr.next=l2;
    return head.next;

     }

    public static void printList(ListNode head){
        ListNode curr= head;
        while(curr!=null){
            System.err.print(curr.val+"-> ");
            curr=curr.next;
        }
        System.err.print("NULL");
    }

    public static void main(String[] args) {
        int[] arr1= {1,2,3,4,5};
        int[] arr2= {1,3,3,4,6,8,9};
        ListNode l1=creaListNode(arr1);
        ListNode l2=creaListNode(arr2);
        printList(merge(l1, l2));


    }
    
}
