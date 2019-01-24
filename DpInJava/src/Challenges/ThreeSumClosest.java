package Challenges;

import java.util.Arrays;

public class ThreeSumClosest {
	public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = Math.abs(target - (nums[0]+nums[1]+nums[2]));
        int result = nums[0]+nums[1]+nums[2];
        for(int i = 0; i<nums.length-2; i++){
            int j = i+1;
            int k = nums.length-1;
            int newTarget= target-nums[i];
            while(j<k){
                if(closest>Math.abs(target - (nums[i]+nums[j]+nums[k]))){
                    closest = Math.abs(target - (nums[i]+nums[j]+nums[k]));
                    result = nums[i]+nums[j]+nums[k];
                }
                if(newTarget >nums[j]+nums[k]) j++;
                else if(newTarget <nums[j]+nums[k]) k--;
                else return target;
            }
        }
        return result;        
    }
}
