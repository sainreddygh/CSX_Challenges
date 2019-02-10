package Challenges;

import java.util.ArrayList;
import java.util.List;

public class AllPathsToTarget {

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n =  graph.length;
        List<List<Integer>>[] dp =  new ArrayList[graph.length];
        for(int i= n-2; i>=0; i--){
            List<List<Integer>> allPaths = new ArrayList();
            for(int j : graph[i]){
                if(j==n-1) {
                   List<Integer> finalPath =new ArrayList();
                   finalPath.add(i);
                   finalPath.add(n-1);
                   allPaths.add(finalPath);
                    continue;
                }
                for(List<Integer> l : dp[j]){
                    List<Integer> currentPath = new ArrayList();
                    currentPath.add(i);
                    for(int li : l){
                        currentPath.add(li);
                    }
                    allPaths.add(currentPath);
                }
            }
            dp[i]= allPaths;
        }
        return dp[0];
    }

}
