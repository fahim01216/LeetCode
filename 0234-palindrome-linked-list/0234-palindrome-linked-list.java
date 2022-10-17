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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        ListNode current = head;
        Stack<Integer> s = new Stack<>();
        while(current != null){
            s.push(current.val);
            current = current.next;
        }
        while(head != null){
            int val = s.pop();
            if(head.val != val)
                return false;
            head = head.next;
        }
        return true;
    }
}