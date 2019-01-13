package ObserverDP;

public interface Subject {
	public void register(Observer newObserver);
	public void unRegister(Observer deleteObserver);
	public void notiFyObservers();

}
