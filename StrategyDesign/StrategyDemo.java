package StrategyDesign;

public class StrategyDemo {

	public static void main(String[] args) {

		PaymentContext context = new PaymentContext(new CardPayment());
		context.makePayment(500);

		context = new PaymentContext(new UpiPayment());
		context.makePayment(500);
	}
}
