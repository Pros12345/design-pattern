package StrategyDesign;

class CardPayment implements PaymentStrategy {
	public void pay(int amount) {
		System.out.println("Paid " + amount + " using Card.");
	}
}

class UpiPayment implements PaymentStrategy {
	public void pay(int amount) {
		System.out.println("Paid " + amount + " using UPI.");
	}
}
