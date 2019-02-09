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
		Random r =  new Random();
	//	System.out.println(r.nextInt(983));
		CarRace cr =  new CarRace();
		System.out.println(cr.carFleet(17, new int[] {8,12,16,11,7}, new int[] {6,9,10,9,7}));
		
		
		
	}
}
