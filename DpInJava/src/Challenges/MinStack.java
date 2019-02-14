package Challenges;

import java.util.Stack;

public class MinStack {
    Stack<Integer> s;
    Stack<Integer> minS;

    /** initialize your data structure here. */
    public MinStack() {
        s = new Stack();
        minS =  new Stack();
    }
    
    public void push(int x) {
        if(s.isEmpty()){
            s.push(x);
            minS.push(x);
        }else{
            if(x<=minS.peek()) minS.push(x);
            s.push(x);            
        }
    }
    
    public void pop() {
        if(s.peek().intValue() == minS.peek().intValue()) minS.pop();
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return minS.peek();        
    }

}
