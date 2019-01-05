package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import Challenges.*;

public class Execution {
	public static void main(String[] args) {
		TreeNode tree = TreeNodePlugins.listToTree(new String[] {"3","5","1","6","2","0","8","null","null","7","4"});
		Queue<TreeNode> q =  new LinkedList<TreeNode>();
		q.add(tree);
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
