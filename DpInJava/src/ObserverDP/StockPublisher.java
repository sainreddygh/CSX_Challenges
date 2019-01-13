package ObserverDP;

import java.util.ArrayList;

public class StockPublisher implements Subject{
	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	StockPublisher(){
		observers =  new ArrayList<Observer>();
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
