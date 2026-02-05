package ObserverDesign;

public class ObserverDemo {
	public static void main(String[] args) {

		YouTubeChannel channel = new YouTubeChannel();

		Observer s1 = new Subscriber("Prosenjit");
		Observer s2 = new Subscriber("Rahul");
		Observer s3 = new Subscriber("Neha");

		channel.registerObserver(s1);
		channel.registerObserver(s2);
		channel.registerObserver(s3);

		channel.uploadVideo("Design Patterns in Java");
	}
}
