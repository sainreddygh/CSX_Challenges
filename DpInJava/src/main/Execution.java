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
		Random r = new Random();
		int[] check =  new int[10];
		int n = 100000000;
		while(n>0) {
			int i = r.nextInt(10);
			check[i]++;
			n--;
		}
		for(int i =0; i<check.length; i++) {
			System.out.println("value for "+i+" index is :"+ check[i]);
		}
	}
}