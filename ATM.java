import java.util.Scanner;
public class ATM {
	private UserAccount[] accounts;
	private UserAccount aAccount;
	Scanner reader = new Scanner(System.in);
	

	public ATM(UserAccount[] accounts) {
		this.accounts = accounts;
	}
	public login(){
		System.out.println("Login: ");
		String name = reader.next();
		System.out.println("PIN: ");
		String pin = reader.next();
		for (int i = 0; i<accounts.length; i++) {
			if(name == accounts[i].getName && password = accounts[i].getPin){
				aAccount = accounts[i];
				return true;
			} else {
				System.out.println("invalid login");
				return false;
			}
		}
	}
	public interface(){
		System.out.println("check balance");
		System.out.println("withdraw funds");
		System.out.println("change name");
		System.out.println("change PIN");
		System.out.println("logout");
		String input = reader.next();
		String balance = "check balance";
		String funds = "withdraw funds";
		String pin = "change pin";
		String cname = "change name";
		String logout = "logout";
		if (input == cname) {
			
		} else if(input == balance){
			System.out.println("Balance is: " + getBalance(aAccount));
		} else if (input == funds){
			System.out.println("Withdraw");
		} else if (input = pin){

		} else if (input = logout){

		}

	}






}