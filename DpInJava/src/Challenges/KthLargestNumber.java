package Challenges;

import java.util.Arrays;

public class KthLargestNumber {
	    public static int findKthLargest(int[] nums, int k) {
	        int done = 0;
	        return sort(nums, 0, nums.length-1, k);
	    }
	    static int sort(int[] nums, int start, int end, int k){
	        if(start ==  end) return nums[start];
	        int pivot = (start+end)/2;
	        int partition = partition(nums, start, end, pivot);
	        if(partition>k-1){            
	            return sort(nums, start, partition-1, k);
	        }else if(partition<k-1){
	            return sort(nums, partition+1, end, k);
	        }else return nums[k];     
	    }
	    static int partition(int[] nums, int start, int end, int pivot){
	    	for(int i : Arrays.copyOfRange(nums,start, end+1)) {
	    		System.out.print(i);
	    	}System.out.println();
	        int pivotValue = nums[pivot];
	        int i = start;
	        int j = end;
	        while(i<j){
	            if(nums[i]> pivotValue){
	                swap(nums, i, j);
	                j--;
	            }else i++;
	        }
	        return i-1;
	    }
	    static void swap(int[] nums, int i, int j){
	        if(i>=nums.length || j>=nums.length || i<0 || j<0) return;
	        int temp =  nums[i];
	        nums[i] =  nums[j];
	        nums[j] =  temp;
	    }
}


