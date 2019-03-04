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
		LFUCache lfu = new LFUCache(2);
		lfu.put(1, 1);
		lfu.put(2, 2);
		System.out.println(lfu.get(1));
		lfu.put(3, 3);
		System.out.println(lfu.get(2));
		System.out.println(lfu.get(3));
		lfu.put(4, 4);
		System.out.println(lfu.get(1));
		System.out.println(lfu.get(3));
		System.out.println(lfu.get(4));
	}	
}