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
		
		
		TheQueue theQueue = new TheQueue(3);
		
		theQueue.insert("16");
		
		theQueue.insert("25");

		theQueue.insert("10");
		theQueue.displayTheQueue();
		

		
		theQueue.remove();
		

		theQueue.displayTheQueue();
		
		theQueue.insert("24");
		
		
	}
}



