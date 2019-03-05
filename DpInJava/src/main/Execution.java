package main;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Observer;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.TreeMap;

import Challenges.*;
import ObserverDP.StockObserver;
import ObserverDP.StockPublisher;
import StrateDesignPattern.Animal;
import StrateDesignPattern.Cat;
import StrateDesignPattern.Dog;

public class Execution {
	public static void main(String[] args) {
		CutOffTrees co =  new CutOffTrees();
		List<Integer> l1 =  new ArrayList(Arrays.asList(1,2,2));
		List<Integer> l2 =  new ArrayList(Arrays.asList(0,0,4));
		List<Integer> l3 =  new ArrayList(Arrays.asList(7,2,2));
		List<List<Integer>> forest =  new ArrayList(Arrays.asList(l1,l2,l3));
		System.out.println(co.cutOffTree(forest));
	}	
}