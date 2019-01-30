package Challenges;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterInt {
    public  static int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans, -1);
        Stack<Integer> s =  new Stack<>();
        for(int i = 0; i<nums.length; i++){
            while(!s.isEmpty() && nums[s.peek()] < nums[i])
                ans[s.pop()] =  nums[i];
            s.push(i);
        }
        for(int i=0; i<nums.length; i++){
            while(!s.isEmpty() && nums[s.peek()] < nums[i])
                ans[s.pop()] =  nums[i];            
        }
        return ans;
        
    }

}
