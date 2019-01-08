package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import Challenges.*;

public class Execution {
	public static void main(String[] args) {
		int[] result = SingleNumberIII.get2SingleNumbers(new int[] {1,2,1,3,2,5});
		for(int n : result) {
			System.out.println(n);
		}
	}
}
