package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import Challenges.*;

public class Execution {
	public static void main(String[] args) {
		int[][] gen = new int[][] {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
		for(int i=0; i<gen.length; i++) {
			for(int j = 0; j<gen[i].length; j++) {
				System.out.print(gen[i][j]+", ");
			}
			System.out.println();
		}
		getNextGen.gameOfLife(gen);
		for(int i=0; i<gen.length; i++) {
			for(int j = 0; j<gen[i].length; j++) {
				System.out.print(gen[i][j]+", ");
			}
			System.out.println();
		}
	}
}
