package ObserverDP;

import java.util.ArrayList;

public class StockPublisher implements Subject{
	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	public StockPublisher(){
		observers =  new ArrayList<Observer>();
		this.aaplPrice=0;
		this.ibmPrice=0;
		this.googPrice=0;
		
	}
	

	public double getIbmPrice() {
		return ibmPrice;
	}


	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObservers();
	}


	public double getAaplPrice() {
		return aaplPrice;
	}


	public void setAaplPrice(double aaplPrice) {
		this.aaplPrice = aaplPrice;
		notifyObservers();
	}


	public double getGoogPrice() {
		return googPrice;
	}


	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
		notifyObservers();
	}


	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver);
		
	}

	@Override
	public void unRegister(Observer deleteObserver) {
		int obIndex =  observers.indexOf(deleteObserver);
		System.out.println("Observer "+(obIndex+1)+" is deleted");
		observers.remove(obIndex);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer o : observers) {
			o.update(this.ibmPrice, this.aaplPrice, this.googPrice);
		}
	}
	
}
