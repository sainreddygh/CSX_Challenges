package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Observer;
import java.util.PriorityQueue;
import java.util.Queue;

import Challenges.*;
import ObserverDP.StockObserver;
import ObserverDP.StockPublisher;
import StrateDesignPattern.Animal;
import StrateDesignPattern.Cat;
import StrateDesignPattern.Dog;

public class Execution {
	public static void main(String[] args) {
		int a = -1;
		int b = 8;
		int c = (int) (Math.pow(a, 2) + Math.pow(b, 2));
		System.out.println(c);
	}
	List<List<Integer>> getMiniDistancePoints(int totalLocations, List<List<Integer>> locations, int numDliveries) {
		List<List<Integer>> ans =  new ArrayList<>();
		PriorityQueue<List<Integer>> pq = new PriorityQueue<List<Integer>>((a,b)->distance(b)-distance(a));
		for(List<Integer> l : locations) {
			pq.add(l);
		}
		for(int i=0; i<numDliveries; i++) {
			ans.add(pq.poll());
		}
		return ans;
	}
	int distance(List<Integer> l) {
		return l.get(0) * l.get(0) + l.get(1)* l.get(1);
	}
}



