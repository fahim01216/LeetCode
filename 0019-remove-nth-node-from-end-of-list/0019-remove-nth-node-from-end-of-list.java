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
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode current = dummy;
        ListNode prev = dummy;
        
        while(n > 0){
            current = current.next;
            n--;
        }
        
        while(current.next != null){
            prev = prev.next;
            current = current.next;
        }
        
        prev.next = prev.next.next;
        return dummy.next;
    }
}