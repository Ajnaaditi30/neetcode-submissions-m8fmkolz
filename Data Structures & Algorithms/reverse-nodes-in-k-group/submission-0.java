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
    public ListNode reverseKGroup(ListNode head, int k) {
        List<Integer> values = new ArrayList<>();
        ListNode curr = head;
        while (curr != null){
            values.add(curr.val);
            curr = curr.next;
        }
        int n = values.size();

        for (int start = 0; start + k <=n; start += k){
            int left = start;
            int right = start + k - 1;
            while (left < right){
                int temp = values.get(left);
                values.set(left, values.get(right));
                values.set(right, temp);
                left++;
                right--;
            }
        }

        curr = head;
        for(int val : values){
            curr.val = val;
            curr = curr.next;
        }

        return head;        
    }
}