package ObserverDesign;

import java.util.ArrayList;
import java.util.List;

class YouTubeChannel implements Subject {

	private List<Observer> observers = new ArrayList<>();

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	public void notifyObservers(String message) {
		for (Observer o : observers) {
			o.update(message);
		}
	}

	// Channel uploads a new video
	public void uploadVideo(String videoName) {
		notifyObservers("New video uploaded: " + videoName);
	}
}
