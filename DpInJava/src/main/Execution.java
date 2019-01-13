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
		StockPublisher stockPub1 = new StockPublisher();
		StockObserver ob1 = new StockObserver();
		stockPub1.register(ob1);

		stockPub1.setAaplPrice(654.34);
		stockPub1.setGoogPrice(100.24);
		stockPub1.setIbmPrice(4.34);
		stockPub1.setAaplPrice(6.34);
		
	}
}
