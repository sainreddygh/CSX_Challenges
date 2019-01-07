package Challenges;

import java.util.Stack;

public class LowestCA {
	public static TreeNode getLCA(TreeNode root, TreeNode p, TreeNode q) {
		int additionalPushes = 0;
        TreeNode anc = root;
        Stack<TreeNode> s =  new Stack<TreeNode>();
        TreeNode curr = root;
        boolean foundOne = false;
        while(curr!=null || !s.isEmpty()){
            while(curr!=null){
                s.push(curr);
                if(foundOne) additionalPushes++;
                curr=curr.left;
            }
            curr=s.pop();
            if(foundOne){                
                additionalPushes--;
                if(additionalPushes < 0) {
                    anc = curr;
                    additionalPushes = 0;
                }
                if(curr == p || curr == q){ return anc;}
            }else if(curr == p || curr == q) {
                anc = curr;
                foundOne =true;
            }
            curr = curr.right;
        }
        return anc;
	}
}
