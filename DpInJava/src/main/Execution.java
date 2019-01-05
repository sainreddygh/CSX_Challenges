package main;

import Challenges.*;

public class Execution {
	public static void main(String[] args) {
		TreeNode tree = TreeNodePlugins.listToTree(new int[] {2,4,5});
		System.out.println(tree.val);
	}

}
