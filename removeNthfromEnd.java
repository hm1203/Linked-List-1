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
//Time complexity: O(n) - list on n nodes
// Space complexity: 0(1)
class Solution {
public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode slow = dummy;
    ListNode fast = dummy;
    // Advances fast pointer so that the gap between first and second is n nodes apart
    int count = 0;
    while(count <=n){
        fast = fast.next;
        count++;
    }
    // Move first to the end, maintaining the gap and at one speed
    while (fast != null) {
        slow = slow.next;
        fast = fast.next;
    }
    slow.next = slow.next.next;
    return dummy.next;
  }
}