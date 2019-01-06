package Challenges;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTree {
	public static void printLevelOrder(TreeNode root) {
		Queue<TreeNode> q =  new LinkedList<TreeNode>();
		q.add(root);
		int current = 1;
		while(!q.isEmpty()) {
			int newLength = current;
			current = 0;
			System.out.println("");
			for(int i = 0; i<newLength; i++) {
				System.out.print(""+q.peek().val+", ");
				if(q.peek().left!=null) {
					q.add(q.peek().left);
					current++;
				}
				if(q.peek().right!=null) {
					q.add(q.peek().right);
					current++;					
				}
				q.poll();
			}
		}
	}
}
