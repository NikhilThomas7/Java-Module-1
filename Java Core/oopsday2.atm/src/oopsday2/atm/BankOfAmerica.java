package oopsday2.atm;

public class BankOfAmerica implements bankingIface {
	
	private Account account = new Account(100,"john","salary",500);

	@Override
	public double withdraw(double amount) {
		
		account.setBalance(account.getBalance() - amount);
		
		return account.getBalance();
		// TODO Auto-generated method stub
		
	}

	@Override
	public double deposit(double amount) {
		
       account.setBalance(account.getBalance() + amount);
		
		return account.getBalance();
		// TODO Auto-generated method stub
		
	}

	@Override
	public double balanceEnqiry(int actno) {
		
		
		// TODO Auto-generated method stub
		return account.getBalance();
	}

}
