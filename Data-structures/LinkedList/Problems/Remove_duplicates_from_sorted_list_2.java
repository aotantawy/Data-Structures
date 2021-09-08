// Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
/**
 * @author Ahmed Osama Tantawy
 * 
 * Objective: remove all duplicates
 * Ex: input: 1 -> 1 -> 2 -> null, output: 2 -> null
 * 
 * Constrains: 0<= l <= 300
 * 
 * Strategy: count frequency of a certain element if frequency > 1 then discard it. otherwise insert element in result
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


public class Remove_duplicates_from_sorted_list_2 {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode resultHead = new ListNode(-200);
        ListNode current = resultHead;
        
        ListNode listPointer = head;
        
        int counter = 0, currentValue = 0;
        
        while (listPointer != null) {
            currentValue = listPointer.val;
            counter = 0;
            
            while(listPointer != null && currentValue == listPointer.val) {
                listPointer = listPointer.next;
                counter++;
            }
            
            if (counter == 1) {
                current.next = new ListNode(currentValue);
                current = current.next;
            }
            
        }
        
        return resultHead.next;
    }
}