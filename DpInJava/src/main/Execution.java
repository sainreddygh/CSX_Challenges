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
		//System.out.println(r.nextInt(988));
		Trie t1 =  new Trie();
		t1.insert("a");
		Trie t2 =  new Trie();
		t2.insert("ap");
		Trie t3 =  new Trie();
		t3.insert("ar");
		String abc = "sainath";
		System.out.println(abc.substring(1,abc.length()));
	}
}

