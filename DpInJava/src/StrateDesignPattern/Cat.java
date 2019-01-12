package StrateDesignPattern;

public class Cat extends Animal {
	public void catchABall() {
		System.out.println(this.getName()+" caught the ball");
	}
	
	public Cat() {
		super();
		setSound("Meow");
	}
	
}
