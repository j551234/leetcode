public class MiddleLinkedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode middleNode(ListNode head) {
        MiddleLinkedList.ListNode fast = head;
        MiddleLinkedList.ListNode slow = head;
       while(fast.next!=null && fast.next.next!=null){
           fast=fast.next.next;
           slow=slow.next;
       }
       if(fast.next!=null){
           slow = slow.next;
       }


       return slow;

    }

}
