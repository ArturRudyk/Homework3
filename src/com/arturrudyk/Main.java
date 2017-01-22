package homework3AddNumbers;

public class Main {
	public static void main(String[] args) {
		ListNode firstNode = new ListNode(5);
		ListNode secondNode = new ListNode(5);
		ListNode thirdNode = new ListNode(9);
		ListNode fourthNode = new ListNode(9);
		ListNode fivethNode = new ListNode(9);
		secondNode.next = thirdNode;
		thirdNode.next = fourthNode;
		fourthNode.next = fivethNode;

		Solution solution = new Solution();
		ListNode resultNode = solution.addTwoNumbers(firstNode, secondNode);
		while(resultNode != null) {
			System.out.println(resultNode.val);
			if (resultNode.next != null) {
				resultNode = resultNode.next;
			} else {
				break;
			}
		}
	}
}
