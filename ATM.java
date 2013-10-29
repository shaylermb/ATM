import java.util.Scanner;
public class ATM {
	private UserAccount[] accounts;
	private UserAccount aAccount;
	Scanner reader = new Scanner(System.in);
	
	public ATM(UserAccount[] accounts) {
		this.accounts = accounts;
	}
	public void login(){
		System.out.println("Login: ");
		String name = reader.next();
		System.out.println("PIN: ");
		String pin = reader.next();
		for (int i = 0; i<accounts.length; i++) {
			if(name.equals(accounts[i].getName()) && pin.equals(accounts[i].getPin())){
				aAccount = accounts[i];
				uInterface();
			} 
		}
		System.out.println("invalid login");
		login();
	}
	public void uInterface() {
		System.out.println("Check balance press 1");
		System.out.println("withdraw funds press 2");
		System.out.println("change name press 3");
		System.out.println("change PIN press 4");
		System.out.println("logout press 5");
		int input = reader.nextInt();
		
		if (input == 1) {
			System.out.println("Balance is: " + aAccount.getBalance());
			uInterface();
		} else if(input == 2){
			System.out.println("How much do you want to withdraw? ");
			double money = reader.nextDouble();
			double x = aAccount.getBalance() - money;
			aAccount.setBalance(x);
			uInterface();
		} else if (input == 3){
			System.out.println("New name? ");
			String nName = reader.next();
			aAccount.setName(nName);
			uInterface();
		} else if (input == 4){
			System.out.println("New PIN? ");
			String nPIN = reader.next();
			if (nPIN.length() == 4) {
				aAccount.setPin(nPIN);
			} else {
				System.out.println("Error not 4 numbers");
			}
			
			uInterface();
		} else if (input == 5){
			login();
		} else {
			System.out.println("Error. Try a different number");
			uInterface();
		}



	}






}