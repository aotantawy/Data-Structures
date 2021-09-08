// Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
/**
 * @author Ahmed Osama Tantawy
 * 
 * Objective: remove all duplicates such that each element appears only once
 * 
 * Constrains: 0<= l <= 300
 * 
 * Strategy: check current element in list if it exists in result then discard it
 * 
 * Complexity: O(l)
 * 
 */


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
public class Remove_duplicates_from_sorted_list {
    public ListNode deleteDuplicates(ListNode head) {        
        ListNode current = head;
        ListNode result = new ListNode(-200);
        ListNode currentResult = result;
        
        while (current != null) {
            if (current.val != currentResult.val) {
                currentResult.next = new ListNode(current.val);
                currentResult = currentResult.next;
            }
            current = current.next;
        }
          
        return result.next;
        
    }
}