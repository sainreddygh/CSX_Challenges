package ObserverDP;

public class StockObserver implements Observer {
	private static int observerTracker = 0;
	private int id;
	
	public StockObserver(StockPublisher stockPub) {
		this.id = ++observerTracker;
		stockPub.register(this);
	}

	@Override
	public void update(double IBMprice, double APPLPrice, double GOOGPrice) {
		// TODO Auto-generated method stub
		System.out.println("Prices are updated on Observer "+this.id+":");
		printPrices(IBMprice, APPLPrice, GOOGPrice);
	}
	
	public void printPrices(double IBMprice, double APPLPrice, double GOOGPrice) {
		System.out.println("IBM price : "+IBMprice+"\nAPPPLE price : "+APPLPrice+"\nGoogle price : "+GOOGPrice+"\n");		
	}

}
