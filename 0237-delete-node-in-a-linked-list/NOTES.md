```
class Solution {
public void deleteNode(ListNode node) {
ListNode temp = node.next;
ListNode current = null;
while(temp != null){
int value = node.val;
node.val = temp.val;
temp.val = value;
temp = temp.next;
current = node;
node = node.next;
}
current.next = null;
}
}
```