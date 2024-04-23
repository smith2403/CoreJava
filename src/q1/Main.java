package q1;

abstract class PaymentMethod {
	public abstract void makePayment(double amoount);
}

class cashPay extends PaymentMethod {
	@Override
	public void makePayment(double amount) {
		System.out.println("paying cash " + amount);
	}
}

class cardPay extends PaymentMethod {
	@Override
	public void makePayment(double amount) {
		System.out.println("card payment " + amount);
	}
}

class UPI extends PaymentMethod {
	@Override
	public void makePayment(double amount) {
		System.out.println("UPI payment " + amount);
	}
}

public class Main {
	public static void main(String[] args) {
		PaymentMethod cash = new cashPay();
		PaymentMethod card = new cardPay();
		PaymentMethod upi = new UPI();

		cash.makePayment(500);
		card.makePayment(850);
		upi.makePayment(250);
	}
}
