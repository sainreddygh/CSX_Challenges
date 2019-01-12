package StrateDesignPattern;

public class Animal {
	private String name;
	private String sound;
	private int weight;
	private int speed;
	
	private Flys flyingBehaviour;
	public String getFlyingBehaviour() {
		return flyingBehaviour.canFly();
	}
	public void setFlyingBehaviour(Flys flyingBehaviour) {
		this.flyingBehaviour = flyingBehaviour;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}	

}
