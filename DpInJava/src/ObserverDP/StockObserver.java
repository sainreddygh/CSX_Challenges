package ObserverDP;

public class StockObserver implements Observer {

	@Override
	public void update(double IBMprice, double APPLPrice, double GOOGPrice) {
		// TODO Auto-generated method stub
		System.out.println("Prices are updated:");
		System.out.println("IBM price : "+IBMprice+"\nAPPPLE price : "+APPLPrice+"\nGoogle price : "+GOOGPrice);
	}

}
