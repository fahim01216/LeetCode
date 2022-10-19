```
class Solution {
public boolean isPalindrome(ListNode head) {
//Breaking the two Linked Lists into two Linked Lists
ListNode slow= head;
ListNode fast= head;
while(fast.next!=null && fast.next.next!=null)
{
slow= slow.next;
fast= fast.next.next;
}
ListNode mid= slow;
//System.out.println(mid.val);
ListNode first= head;
ListNode sec= mid.next;
​
//Reversing the second Linked List
ListNode prev= null;
ListNode curr= sec;
while(curr!=null)
{
ListNode nxt= curr.next;
curr.next= prev;
prev= curr;
curr= nxt;
}
sec= prev;
​
//Comparing the two Linked Lists
ListNode tmp1= first;
ListNode tmp2= sec;
while(tmp1!=null && tmp2!=null)
{
if(tmp1.val!=tmp2.val)
return false;
tmp1= tmp1.next;
tmp2= tmp2.next;
}
return true;
}
}
```