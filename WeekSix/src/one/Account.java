package one;

import java.util.ArrayList;
import java.util.List;

public class Account {
	
	private long id;
	private String accountType;
	
	public Account(long id, String accountType) {
		super();
		this.id = id;
		this.accountType = accountType;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public static List<Account> createAccounts(int numAccounts) {
		List<Account> accounts = new ArrayList<>();
		for(int index = 0; index < numAccounts; index++) {
			if(Math.random() > 0.5) {
				accounts.add(new Account(index, "Checking"));
			} else {
				accounts.add(new Account(index, "Savings"));
			}
		}
		return accounts;
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", accountType=" + accountType + "]";
	}
	

}
