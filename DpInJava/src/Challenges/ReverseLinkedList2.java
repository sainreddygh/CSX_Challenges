package Challenges;

import java.util.Stack;

public class ReverseLinkedList2 {
	public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
	}
	public static ListNode reverseBetween(ListNode head, int m, int n) {
        if(m==n) return head;
        int currentPos = 0;
        ListNode p1 = new ListNode(0);
        p1.next = head;
        while(currentPos<m-1){
            p1 = p1.next;
            currentPos++;
        }
        ListNode temp0 = p1.next;
        ListNode temp1 = p1.next.next;
        ListNode temp2 = p1.next.next.next;
        int switched = 0;
        while(switched<n-m){
            temp1.next = temp0;
            temp0 = temp1;
            temp1 = temp2;
            if(temp2!=null) temp2 = temp2.next;
            switched++;
        }
        p1.next.next = temp1;
        p1.next = temp0;
        if(m ==1) return temp0;
        return head;
        
    }
}
