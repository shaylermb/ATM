public class UserAccount {

	private double balance;
	private double newbalance;
	private String name;
	private String pin;

	public double getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		if (pin.equals(4)) {
			this.pin = pin;
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(int newbalance) {
		this.balance = newbalance;
	}

}