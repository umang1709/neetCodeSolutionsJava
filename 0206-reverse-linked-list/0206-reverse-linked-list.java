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
    public ListNode reverseList(ListNode head) {
        //will use 3pointers to solve it
        //curr = head; prev = null;
        //tempNext = curr.next;
        // curr.next = prev, prev = curr, curr.next = tempNext;
        
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode tempNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tempNext;
        }
        head = prev;
        return head;
    }
}