// Remove Duplicates from Sorted List II Java Leetcode
// Salesforce


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
         // Create a new node at index 0
        ListNode result = new ListNode(0);
        result.next = head;

        // Create a pointer to the newly created node to help with traversal
        ListNode ptr = result;
        while (ptr.next!=null && ptr.next.next !=null) {
            if(ptr.next.val == ptr.next.next.val) {
                // Duplicate found
                int dup = ptr.next.val;
                while(ptr.next!=null && ptr.next.val == dup) {
                    // As long as the node values are equal to the duplicate value, remove the nodes
                    ptr.next = ptr.next.next;
                }
            } else {
                ptr = ptr.next;
            }
        }
        return result.next;
    }
}
