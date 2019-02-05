package Challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UndirectedGraphClone {
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        Map<Integer, UndirectedGraphNode> map = new HashMap<>();
        UndirectedGraphNode newNode =  new UndirectedGraphNode(node.label);
        map.put(node.label, newNode);
        cloneNeighbors(newNode, node, map);
        return newNode;
        
    }
    void cloneNeighbors(UndirectedGraphNode newNode, UndirectedGraphNode oldNode, Map<Integer, UndirectedGraphNode> map){
        for(UndirectedGraphNode neighbor : oldNode.neighbors){
            if(map.containsKey(neighbor.label)){
                newNode.neighbors.add(map.get(neighbor.label));
            }else{
                UndirectedGraphNode newNeighbor =  new UndirectedGraphNode(neighbor.label);
                newNode.neighbors.add(newNeighbor);
                map.put(newNeighbor.label, newNeighbor);
                cloneNeighbors(newNeighbor, neighbor, map);
            }
        }
    }
}

class UndirectedGraphNode {
	int label;
    List<UndirectedGraphNode> neighbors;
    UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
};