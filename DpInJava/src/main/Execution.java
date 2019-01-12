package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import Challenges.*;
import StrateDesignPattern.Animal;
import StrateDesignPattern.Cat;
import StrateDesignPattern.Dog;

public class Execution {
	public static void main(String[] args) {
		Animal doggy = new Dog();
		Animal catty =  new Cat();
		System.out.println(doggy.getFlyingBehaviour());
		System.out.println(catty.getFlyingBehaviour());
	}
}
