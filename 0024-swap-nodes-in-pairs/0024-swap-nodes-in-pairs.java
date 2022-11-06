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
    public ListNode swapPairs(ListNode head) {
        ListNode slow = head;
        ListNode fast = null;
        while(slow != null && slow.next != null){
            fast = slow.next;
            int temp = slow.val;
            slow.val = fast.val;
            fast.val = temp;
            slow = fast.next;
        }
        return head;
    }
}