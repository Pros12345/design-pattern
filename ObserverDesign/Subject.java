package ObserverDesign;

interface Subject {
	void registerObserver(Observer o);

	void removeObserver(Observer o);

	void notifyObservers(String message);
}
