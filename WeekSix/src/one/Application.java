package one;

import java.util.List;

public class Application {
	
	public static void main(String[] args) {
		
		List<Account> accounts = Account.createAccounts(5);
		
		for(Account a : accounts) {
			System.out.println(a);
		}
		
	}

}
