package main;

import java.util.ArrayList;
import java.util.Arrays;
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
		int[] input  =  new int[] {3,2,1,5,6,4,8};
//		for(int i : Arrays.copyOfRange(input,0,7)) {
//    		System.out.print(i);
//    	}
		System.out.println(KthLargestNumber.findKthLargest(input, 2));
		
	}
}



