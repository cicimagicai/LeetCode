/*
142. Linked List Cycle II

Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Note: Do not modify the linked list.

Follow up:
Can you solve it without using extra space?
*/

class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val = x;
	}
}

public class LC142{
	// Time Complexity: O(N)
	// Runtime: 1ms, beats 19.68%
	public ListNode detectCycle(ListNode head){
		if(head == null)
			return null;

		ListNode slow = head, fast = head;
		boolean isCycle = false;

		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(fast == slow)
				isCycle = true;
		}

		if(!isCycle)
			return null;

		slow = head;
		while(slow != fast){
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
}