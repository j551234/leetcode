public class CycleLinkListCheck {
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

    public ListNode detectCycle(ListNode head) {
        CycleLinkListCheck.ListNode fast = head;
        CycleLinkListCheck.ListNode slow= head;

        while(fast.next != null && fast.next.next!=null){
            fast=fast.next.next;
            slow = slow.next;
            if(fast==slow){
                // if meet then cycle
                // return pointer to begin
                slow = head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;

    }
}
