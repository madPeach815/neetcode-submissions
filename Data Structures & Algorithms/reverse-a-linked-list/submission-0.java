/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

//Given the beginning of a singly linked list head, reverse the list, and return the new beginning of the list. 
class Solution {

    //first we need to set prev(previous) and curr(current).
    //we set prev to null and curr to head. 
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        //now we need to change the arrow direction. 
        //we need a temparary variable(nextTemp) so after we change curr.next direction we can   
        //keep moving to the next integer. 
        while(curr != null){
            //first nextTemp save the next int after curr. 
            ListNode nextTemp = curr.next;
            //and we change the direction. curr.next will be null. 
            curr.next = prev;
            //and the prev null will be the first integer. 
            prev = curr;
            //and curr will move to the next integer which we saved in nextTemp. 
            curr = nextTemp;
        }

        return prev;
        
    }
}
