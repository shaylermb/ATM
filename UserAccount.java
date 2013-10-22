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
		if (pin.length() = 4) {
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

/*
1) How do we make multiple accounts?
2) How do we set up ATMRunner?
3) How do we login?
4) How do we log out?
5) What happens when we log out?
6) Who writes the code that the ATM uses?
7) What does the this in this.balance mean?
8) Can I withdraw more money than I have?
9) How does this work?
10) How do you use classes?
/*