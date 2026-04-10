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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first=head;
        ListNode second=head;
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            n++;
        }

        int p1=k;
        int p2=n-k+1;

        for(int i=1;i<p1;i++){
            first=first.next;
        }
        for(int i=1;i<p2;i++){
            second=second.next;
        }

        int tempVal=first.val;
        first.val=second.val;
        second.val=tempVal;

        return head;
        
    }
}