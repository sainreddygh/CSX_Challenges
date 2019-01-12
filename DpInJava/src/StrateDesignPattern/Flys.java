package StrateDesignPattern;

public interface Flys {
	String canFly();
}

class Canfly implements Flys {
	public String canFly() {
		return "I can Fly";
	}
}

class CanNotfly implements Flys {
	public String canFly() {
		return "I can not Fly";
	}
}