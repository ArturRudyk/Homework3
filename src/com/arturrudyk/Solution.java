package homework3AddNumbers;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
	private ListNode result = new ListNode(0);
    private ListNode nodeBuffer = result;
    private int sum = 0;
    private int overflow = 0;
    private int firstvalue = 0;
    private int secondvalue = 0;
    
    public ListNode addTwoNumbers(ListNode firstNode, ListNode secondNode) {
       while (firstNode != null || secondNode != null) {
           if (firstNode != null) {
               firstvalue = firstNode.val;
           }else {
              firstvalue = 0; 
           }
           if (secondNode != null) {
               secondvalue = secondNode.val;
           }else {
              secondvalue = 0; 
           }
           sum = firstvalue + secondvalue + overflow;
           overflow = sum/10;
           nodeBuffer.next = new ListNode(sum % 10);
           nodeBuffer = nodeBuffer.next;
           nodeBuffer.val = sum % 10;
           if (firstNode != null) {
               firstNode = firstNode.next;
           }
           if (secondNode != null) {
               secondNode = secondNode.next;
           }
       }
       if (overflow > 0) {
            nodeBuffer.next = new ListNode(overflow);
       }
       result = result.next;
    return result;    
    }
}