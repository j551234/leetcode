import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList {
    public static class ListNode {
        int val;
        ReverseLinkedList.ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ReverseLinkedList.ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;


        while(current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }




    private static ListNode createFromArray(int[] inputs) {
        ListNode linkList = new ListNode();
        ListNode startNode = linkList;
        for (int i = 0; i < inputs.length; i++) {

            linkList.val = inputs[i];
            if (i == 0) {
                startNode = linkList;
            }
            if (i + 1 < inputs.length) {
                linkList.next = createFromInt(inputs[i + 1]);
                linkList = linkList.next;
            }
        }
        return startNode;

    }

    private static ListNode createFromInt(Integer number) {
        ListNode node = new ListNode();
        node.val = number;
        return node;
    }


    public static void main(String[] args) {
        int[] testElement = {1, 2, 3, 4, 5};
        ListNode node = createFromArray(testElement);
        ListNode reverseNode = reverseList(node);
        System.out.println(node);

    }
}
