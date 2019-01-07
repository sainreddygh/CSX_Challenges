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
		LowestCA.getLCA(tree);
	}

}
