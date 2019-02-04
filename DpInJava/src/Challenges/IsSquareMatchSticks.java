package Challenges;

public class IsSquareMatchSticks {
	public static boolean makesquare(int[] nums) {
        int squareL = 0;
        int sideL = 0;
        for(int i : nums)
            squareL+=i;
        if(squareL % 4 !=0){
            return false;
        }else {
            sideL = squareL/4;
        }
        return getSquare(nums, new int[4], 0, sideL);
    }
    static boolean getSquare(int[] nums, int[] store, int index, int sideL){
        if(index==nums.length-1){
            for(int i : store){
                if(i<sideL)
                    return i+nums[index] ==  sideL;
            }
        }else {
            for(int i =0; i<4; i++){
                if(store[i]+nums[index]<=sideL){
                    store[i]+=nums[index];
                    if(getSquare(nums, store, index+1, sideL))
                        return true;
                    else store[i]-=nums[index];                    
                }
            }
        }
        return false;
    }

}
