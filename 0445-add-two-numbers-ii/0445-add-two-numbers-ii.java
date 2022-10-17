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
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null)
            return head;
        ListNode prev = null;
        ListNode current = head;
        ListNode nxt = head;
        while(current != null){
            nxt = current.next;
            current.next = prev;
            prev = current;
            current = nxt;
        }
        return prev;
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        
        ListNode x1 = reverse(l1);
        ListNode x2 = reverse(l2);
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        int carry = 0;
        while(x1 != null || x2 != null || carry > 0){
            int sum = 0;
            if(x1 != null){
                sum += x1.val;
                x1 = x1.next;
            }
            if(x2 != null){
                sum += x2.val;
                x2 = x2.next;
            }
            sum += carry;
            carry = sum /10;
            ListNode node = new ListNode(sum % 10);
            temp.next = node;
            temp = temp.next;
        }
        return reverse(dummy.next);
    }
}