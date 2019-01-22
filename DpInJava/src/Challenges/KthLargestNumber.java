package Challenges;

import java.util.Arrays;

public class KthLargestNumber {
	public static int findKthLargest(int[] nums, int k) {
        int done = 0;
        return sort(nums, 0, nums.length-1, nums.length-k);
    }
    static int sort(int[] nums, int start, int end, int k){
        if(start ==  end) return nums[start];
        int pivot = (start+end)/2;
        System.out.println("start is "+start+" and end is "+end);
        for(int i=start; i<=end; i++) {
        	System.out.print(nums[i]);
        }
        System.out.println();
        int partition = partition(nums, start, end, pivot);
        System.out.println("pivot is "+pivot+" partition Index is "+partition);
        for(int i=start; i<=end; i++) {
        	System.out.print(nums[i]);
        }
        System.out.println();     
        System.out.println();        
        if(partition>k){            
            return sort(nums, start, partition-1, k);
        }else if(partition<k){
            return sort(nums, partition+1, end, k);
        }else return nums[k];     
    }
    static int partition(int[] nums, int left, int right, int pivot_index){
        
//         int pivot = nums[pivot_index];
//         // 1. move pivot to end
//         swap(nums, pivot_index, right);
//         int store_index = left;

//         // 2. move all smaller elements to the left
//         for (int i = left; i <= right; i++) {
//           if (nums[i] < pivot) {
//             swap(nums, store_index, i);
//             store_index++;
//           }
//         }

//         // 3. move pivot to its final place
//         swap(nums,store_index, right);

//         return store_index;
//        int pivotValue = nums[pivot_index];
//        int i = left;
//        int j = right;
//        while(i<j){
//        	for(int l : nums) System.out.print(l);
//        	System.out.println();
//        	System.out.println("i is "+i+" and j is "+j);
//            if(nums[i]>= pivotValue){
//                swap(nums, i, j);
//                j--;
//            }else i++;
//        }
//        return i-1;
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


