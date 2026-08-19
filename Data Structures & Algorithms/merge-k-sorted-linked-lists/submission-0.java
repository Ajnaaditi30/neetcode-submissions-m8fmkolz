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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> values = new ArrayList<>();

        // Collect all values from every list
        for (ListNode node : lists) {
            while (node != null) {
                values.add(node.val);
                node = node.next;
            }
        }

        // Sort all values
        Collections.sort(values);

        // Build the merged linked list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next;
    }
}