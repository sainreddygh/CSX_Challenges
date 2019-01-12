package StrateDesignPattern;

public class Dog extends Animal {
	public void digAHole() {
		System.out.println("Dug a Hole");
	}
	
	public Dog() {
		super();
		setSound("Bark");
		CanNotfly cannotFly = new CanNotfly();
		setFlyingBehaviour(cannotFly);
	}
}
