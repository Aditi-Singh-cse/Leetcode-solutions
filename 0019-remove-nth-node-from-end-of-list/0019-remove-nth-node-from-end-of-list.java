/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
    class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // If first node needs removal
        if (count == n) {
            return head.next;
        }

        ListNode q = head;

        // Move to node before target
        for (int i = 1; i < count - n; i++) {
            q = q.next;
        }

        // Remove node
        q.next = q.next.next;

        return head;
    }
}

        
    

