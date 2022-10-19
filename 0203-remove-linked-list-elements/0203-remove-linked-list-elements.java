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
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val)
            head = head.next;
        
        if(head != null){
            ListNode current = head;
            ListNode prev = null;
            while(current != null){
                if(current.val != val){
                    prev = current;
                    current = current.next;
                }
                else{
                    prev.next = current.next;
                    current = current.next;
                }
            }
        }
        return head;
    }
}