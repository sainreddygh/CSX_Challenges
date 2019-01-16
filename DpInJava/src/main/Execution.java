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
		for(int i : Deprost.getTopol(new int[][] {{4,2}, {6,3}, {3,2}, {6,4}})) {
			System.out.println(i);
		}
	}
}



