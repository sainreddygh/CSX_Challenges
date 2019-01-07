package Challenges;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TreeNodePlugins {
	public static TreeNode  listToTree(String[] list) {
		Queue<TreeNode> q = new LinkedList<>();
		if(list[0] =="null") return null;
		TreeNode result = new TreeNode(Integer.valueOf(list[0]));
		q.add(result);
		boolean leftDone = false;
		for(int i=1; i<list.length; i++) {
			if(!leftDone) {
				if(list[i].equals("null")) {
					q.peek().left = null;
				}else {
					TreeNode tr =  new TreeNode(Integer.valueOf(list[i]));
					q.peek().left =tr;			
					q.add(tr);
				}				
				leftDone = true;
			}else {
				if(list[i].equals("null")) {
					q.poll().right = null;
				}else {
					TreeNode current = new TreeNode(Integer.valueOf(list[i]));
					q.poll().right = current;
					q.add(current);
				}				
				leftDone = false;
			}
		}
		return result;		
	}
}
