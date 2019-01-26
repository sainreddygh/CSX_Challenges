package Challenges;

import java.util.Arrays;

public class MinimumBoats {
	public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0;
        int j = people.length-1;
        int boats = 0;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                i++;
                j--;
            }else {
                j--;
            }boats++;
        }
        return boats;
        
    }

}
