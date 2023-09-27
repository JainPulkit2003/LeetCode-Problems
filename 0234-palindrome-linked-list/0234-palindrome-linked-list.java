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
    public ListNode reverse(ListNode head) {
        ListNode prev= null;
        ListNode curr = head;

        while(curr != null) {
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
        }
        return prev;
    }

    public ListNode findMiddle(ListNode head) {
        ListNode jump1 = head;
        ListNode jump2 = head;
        while(jump1.next != null && jump1.next.next != null) {
        jump1 = jump1.next.next;
        jump2 = jump2.next;
        }
        return jump2;
    }

    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
        {
            return true;
        }

        ListNode middle = findMiddle(head);
        ListNode Start2 = reverse(middle.next);

        ListNode Start1 = head;
        while(Start2!=null)
        {
            if(Start1.val != Start2.val)
        {
            return false;
        }
        Start1 = Start1.next;
        Start2 = Start2.next;
        }
        return true;
    }
}