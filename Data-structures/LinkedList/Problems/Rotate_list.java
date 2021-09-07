/**
 * @author Ahmed Osama Tantawy @aotantawy
 * 
 *         Description: rotate LinkedList to the right by k places
 * 
 *         Constrains: 0 <= l1 <= 500, 0 <= k <= 2 * 10^9 
 * 
 *         Strategy: 1- get make two pointers (one at the beginning and the second at beginning+(k%list size)) 2- make second pointer refers to head 2- assign first pointer to head
 *
 *         Overall Complexity: O(l1)
 * 
 */

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */

public class Rotate_list {

    public int getSize(ListNode head) { // O(l1)
        ListNode current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public ListNode getFastPointer(ListNode head, int mod) { // O(l1)
        if (head == null)
            return head;
        ListNode fastPointer = head;
        while (mod > 0) {
            fastPointer = fastPointer.next;
            mod--;
        }
        return fastPointer;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return head;

        int listSize = getSize(head);
        int mod = k % listSize;
        ListNode slowPointer = head;
        ListNode fastPointer = getFastPointer(head, mod);

        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }

        fastPointer.next = head;
        head = slowPointer.next;
        slowPointer.next = null;

        return head;
    }
}
