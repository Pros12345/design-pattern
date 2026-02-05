package SingletonDesign;

public class SingletonDesign {
	public static void main(String[] args) {
		SingleTonDesignObject sd = SingleTonDesignObject.getInstance();
	}
}

class SingleTonDesignObject {
	private static SingleTonDesignObject s;

	private SingleTonDesignObject() {

	}

	public static synchronized SingleTonDesignObject getInstance() {
		if (s == null)
			s = new SingleTonDesignObject();
		return s;
	}
}