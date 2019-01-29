package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
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
		int ans = ShortestSubArray.getLength(new int[] {-28,81,-20,28,-29}, 89);
		System.out.println(ans);
	}
}
