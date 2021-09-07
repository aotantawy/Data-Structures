/**
 * @author Ahmed Osama Tantawy @aotantawy
 * 
 *         Description: Merge two sorted LinkedList and return a sorted merged LinkedList
 * 
 *         Constrains: 0 <= l1, l2 <= 50
 *
 *         Overall Complexity: O(max(l1,l2))
 * 
 */

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
public class Merge_two_sorted_lists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode result = new ListNode();
        ListNode currentResult = result;

        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                currentResult.next = new ListNode(l2.val);
                l2 = l2.next;
            } else {
                currentResult.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            currentResult = currentResult.next;
        }

        while (l2 != null) {
            currentResult.next = new ListNode(l2.val);
            l2 = l2.next;
            currentResult = currentResult.next;
        }

        while (l1 != null) {

            currentResult.next = new ListNode(l1.val);
            l1 = l1.next;
            currentResult = currentResult.next;
        }
        return result.next;
    }
}