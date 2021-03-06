package Challenges;

import java.util.Arrays;

public class KthLargestNumber {
	public static int findKthLargest(int[] nums, int k) {
        return sort(nums, 0, nums.length-1, nums.length-k);
    }
    static int sort(int[] nums, int start, int end, int k){
        if(start ==  end) return nums[start];
        int pivot = (start+end)/2;
        int partition = partition(nums, start, end, pivot);
        if(partition>k){            
            return sort(nums, start, partition-1, k);
        }else if(partition<k){
            return sort(nums, partition+1, end, k);
        }else return nums[k];     
    }
    static int partition(int[] nums, int left, int right, int pivot_index){
    	int pivotVal = nums[pivot_index];
    	swap(nums, right, pivot_index);
    	int partIndex = left;
    	for(int i= left; i<right; i++) {
    		if(nums[i] <pivotVal) {
    			swap(nums, partIndex, i);
    			partIndex++;
    		}
    	}
    	swap(nums, partIndex, right);
    	return partIndex;
    }
    public static void swap(int[] nums, int i, int j){
        if(i>=nums.length || j>=nums.length || i<0 || j<0) return;
        int temp =  nums[i];
        nums[i] =  nums[j];
        nums[j] =  temp;
    }
}


