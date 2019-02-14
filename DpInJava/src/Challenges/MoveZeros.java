package Challenges;

public class MoveZeros {
	public void moveZeroes(int[] nums) {
        int fz = 0;
        while(fz<nums.length && nums[fz]!=0) fz++;
        int lz = fz;
        int i = fz+1;
        while(i<nums.length){
            if(nums[i]==0){
                lz++;
                i++;
            }else {
                nums[fz] =nums[i];
                nums[i] = 0;
                fz++;
                lz++;
                i++;
            }
        }
    }
}
