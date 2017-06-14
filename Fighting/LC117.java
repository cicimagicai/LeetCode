/*
117. Populating Next Right Pointers in Each Node II

Follow up for problem "Populating Next Right Pointers in Each Node".

What if the given tree could be any binary tree? Would your previous solution still work?

Note:

You may only use constant extra space.
For example,
Given the following binary tree,
         1
       /  \
      2    3
     / \    \
    4   5    7
After calling your function, the tree should look like:
         1 -> NULL
       /  \
      2 -> 3 -> NULL
     / \    \
    4-> 5 -> 7 -> NULL
*/

class TreeLinkNode{
	int val;
	TreeLinkNode left, right, next;
	TreeLinkNode(int x){
		val = x;
	}
}

public class LC117{
	// Time Complexity: O(N)
	// Runtime: 1ms, beats 53.82%
	public void connect(TreeLinkNode root){
		TreeLinkNode head = null; // head of the next level
		TreeLinkNode prev = null; // the leading node of the next level
		TreeLinkNode cur = root;

		while(cur != null){
			while(cur != null){
				if(cur.left != null){
					if(prev == null)
						head = cur.left;
					else
						prev.next = cur.left;
					prev = cur.left;
				}

				if(cur.right != null){
					if(prev == null)
						head = cur.right;
					else
						prev.next = cur.right;
					prev = cur.right;
				}

				cur = cur.next;
			}
			cur = head;
			head = null;
			prev = null;
		}
	}
}