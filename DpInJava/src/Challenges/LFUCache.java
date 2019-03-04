package Challenges;

import java.util.HashMap;

public class LFUCache {
	    class DLList {
	        int value;
	        int key;
	        int frequency;
	        DLList left;
	        DLList right;
	        public DLList(int key, int v){
	            this.key =key;
	            value = v;
	            frequency = 1;
	        }
	    }
	    HashMap<Integer, DLList> map;
	    int cap;
	    int size=0;
	    DLList head;
	    DLList tail;
	    public LFUCache(int capacity) {
	        map = new HashMap();
	        cap = capacity;
	        head = new DLList(0,0);
	        tail = new DLList(0,0);
	        head.frequency = 0;
	        tail.frequency = 0;
	        head.right = tail;
	        tail.left = head;
	    }
	    
	    public int get(int key) {
	        DLList c = map.get(key);
	        if(c==null) return -1;
	        c.frequency++;
	        placeTop(c);
	        return c.value;
	    }
	    
	    public void put(int key, int value) {
	        DLList c = map.get(key);
	        if(c==null){
	            c = new DLList(key,value);            
	            addKey(c);
	            return;
	        }
	        c.value =value;
	        c.frequency++;
	        placeTop(c);
	    }
	    
	    void addKey(DLList c){
	        if(cap==0) return;
	        DLList last = tail.left;
	        if(size==cap && last!=head){            
	            map.remove(last.key);
	            last.left.right = c;
	            tail.left = c;
	            c.left =last.left;
	            c.right = tail;
	            last.left = null;
	            last.right = null;     
	        } else {
	            last.right = c;
	            c.left = last;
	            c.right = tail;
	            tail.left = c;
	            size++;
	        }
	        placeTop(c);             
	        map.put(c.key, c);
	    }
	    
	    void placeTop(DLList c){
	        while(c.left.frequency==c.frequency){
	            DLList left = c.left;
	            DLList right = c.right;
	            left.left.right = c;
	            c.left = left.left;
	            left.right = right;
	            right.left = left;
	            c.right = left;
	            left.left =c;            
	        }
	    }
	}
