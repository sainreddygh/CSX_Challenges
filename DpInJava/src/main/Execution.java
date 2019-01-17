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
		PriorityQueue<Location> pq = new PriorityQueue<Location>((a,b)->distance(b)-distance(a));
		for(List<Integer> l : locations) {
			Location loc = new Location(l);
			pq.add(loc);
		}
		for(int i=0; i<numDliveries; i++) {
			ans.add(pq.poll().location);
		}
		return ans;
	}
	int distance(Location l) {
		return l.location.get(0) * l.location.get(0) + l.location.get(1)* l.location.get(1);
	}
	class Location{
		List<Integer> location;
		public Location(List<Integer> location) {
			this.location = location;
		}		
	}
}



