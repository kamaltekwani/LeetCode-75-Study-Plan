/**
 * Problem Link : https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/
 * Solution Link : 
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Q2095_Delete_the_Middle_Node_of_a_Linked_List 
{
    public ListNode deleteMiddle(ListNode head) 
    {
        if(head == null || head.next == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;

        ListNode previous = null;

        while(fast != null && fast.next != null)
        {
            previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        previous.next = slow.next;
    
        return head;
    }
}
