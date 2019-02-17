package Challenges;

// Definition for singly-linked list.
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
 

public class MergeKSortedLists {
	public ListNode mergeKLists(ListNode[] lists) {
        return mergeLists(lists, 0, lists.length-1);   
    }
    public ListNode mergeLists(ListNode[] lists, int s, int e){
        if(s>e) return null;
        if(s==e) return lists[s];
        return mergeTwo(mergeLists(lists, s, (s+e)/2), mergeLists(lists, (s+e)/2+1, e));
    }
    public ListNode mergeTwo(ListNode n1, ListNode n2){
        if(n1==null) return n2;
        if(n2==null) return n1;
        ListNode ans = n1.val<n2.val ? n1 : n2;
        while(n1!=null && n2!=null){
            ListNode temp;
            if(n2.val<=n1.val){
                temp = n2;
                n2 = n1;
                n1=temp;
            }
            while(n1.next!=null && n1.next.val<n2.val) n1 = n1.next;
            temp = n2.next;
            n2.next = n1.next;
            n1.next = n2;
            n1=n2;
            n2 = temp;
            if(n1.next==null){
                n1.next = n2;
                break;
            }
            n1 = n1.next;
        }
        return ans;
    };

}
