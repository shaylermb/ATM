class ATMRunner {


	public static void main(String[] args) {


		UserAccount[] accounts =new UserAccount[3];
		accounts[0] = new UserAccount("Bob", "1234", 100.00);
		accounts[1] = new UserAccount("Alice", "3333", 250.00);
		accounts[2] = new UserAccount("JT", "0001", 999999999.00);
		ATM myATM = new ATM(accounts);		
		myATM.login();

	}
		
}

