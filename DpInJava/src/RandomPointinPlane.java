import java.util.Random;
import java.util.TreeMap;

public class RandomPointinPlane {
	class Solution {
	    TreeMap<Integer, Integer> map;
	    Random rand =  new Random();
	    int[][] rects;
	    int sum = 0;
	    public Solution(int[][] rects) {
	        this.rects =  rects;
	        map =  new TreeMap<>();
	        for(int c = 0; c<rects.length; c++){
	            int[] rect =  rects[c];
	            for(int i= rect[0]; i<=rect[2]; i++){
	                for(int j=rect[1]; j<rect[3]; j++){
	                    sum++;
	                }
	            }
	            map.put(sum,c);
	        }
	    }
	    
	    public int[] pick() {
	        // nextInt(sum) returns a num in [0, sum -1]. After added by 1, it becomes [1, sum]
	        int rectIndex = map.ceilingKey( rand.nextInt(sum) + 1);
	        int[] rect =  rects[map.get(rectIndex)];
	        //int[] rect = rects[map.ceilingEntry(randomListIndex).getValue()];
	        
	         int left = rect[0], right = rect[2], bot = rect[1], top = rect[3];
	        
	        return new int[]{left + rand.nextInt(right - left + 1), bot + rand.nextInt(top - bot + 1) };
	        // int randomListIndex = rand.nextInt(sum)+1;
	        // int[] rect = rects[map.ceilingEntry(randomListIndex).getValue()];
	        // int randX = rect[0]+rand.nextInt(Math.abs(rect[2]-rect[0])+1);
	        // int randY = rect[1]+rand.nextInt(Math.abs(rect[3]-rect[1])+1);
	        // return new int[]{randX, randY};
	    }
	}
}
