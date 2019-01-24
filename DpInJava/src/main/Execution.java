package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Observer;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

import Challenges.*;
import ObserverDP.StockObserver;
import ObserverDP.StockPublisher;
import StrateDesignPattern.Animal;
import StrateDesignPattern.Cat;
import StrateDesignPattern.Dog;

public class Execution {
	public static void main(String[] args) {
		TreeMap<Integer, Integer> map =  new TreeMap<>();
		map.put(2, 1291);
		map.put(6, 1397932);
		map.put(20, 1949832);
		map.put(10, 13829);
		System.out.println(map.ceilingEntry(15).getValue());
		
	}
}



