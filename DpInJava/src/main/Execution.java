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
		System.out.println(getRandomVal());
	}
	static int getRandomVal() {
		class Point{
			int x;
			int y;
			Point(int x, int y){
				this.x = x;
				this.y = y;
			}
		}
		Point p = new Point(2,3);
		return p.x;
	}
}