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
        if(head.next == null)
        {
            return null;
        }
        ListNode temp = head;
        int count = 0;
        while(temp!=null)
        {
            temp = temp.next;
            count++;
        }
        if(n==count)
        {
            return head.next;
        }
        int prev = count-n;
        ListNode previous = head;
        int i = 1;
        while(i < prev)
        {

            previous = previous.next;
            i++;
        }
        previous.next = previous.next.next;
        return head;
    }
}