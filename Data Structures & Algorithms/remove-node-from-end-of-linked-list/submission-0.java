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
    public ListNode removeNthFromEnd(ListNode head, int n) {  //n=2
        ListNode temp = new ListNode(0);
        temp.next = head;          //[0,1,2,3,4,6] temp
        ListNode slow = temp;
        ListNode fast = temp;
        for(int i=0;i<n;i++){    //fast at 2
            fast = fast.next;
        }
        while(fast.next!=null){
            fast =fast.next;
            slow= slow.next;
        }
        slow.next = slow.next.next;
        return temp.next;
    }    
}
