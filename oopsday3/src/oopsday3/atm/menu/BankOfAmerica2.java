package oopsday3.atm.menu;

public class BankOfAmerica2 implements BankingIface2 {
	
	private Account[] accounts = new Account[5];
	int accountIndex =0;
	
	public BankOfAmerica2() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Account[] getAccount() {
		return accounts;
	}


	public void setAccount(Account[] account) {
		this.accounts = accounts;
	}


	public BankOfAmerica2(Account[] account) {
		super();
		this.accounts = accounts;
	}


	@Override
	public double withdraw(double amount, int actno) throws InsufficientFundsException {
		double tempBal=0;
		for (int i=0;i<accounts.length;i++) {
			
			if(accounts[i].getActno() == actno){
				
				if(accounts[i].getBalance() < amount) {
					throw new InsufficientFundsException();
				}
				
			}
			if(accounts[i].getActno() == actno){
				tempBal = accounts[i].getBalance();
				
				tempBal-= amount;
				accounts[i].setBalance(tempBal);
				}
			}
	return tempBal;
		
	}

	@Override
	public double deposit(double amount,int actno) {
		double tempBal=0;
		for (int i=0;i<accounts.length;i++) {
			
			if(accounts[i].getActno() == actno){
				tempBal = accounts[i].getBalance();
				
				tempBal+= amount;
				accounts[i].setBalance(tempBal);
				}
			}
	return tempBal;
		
	
		
	}

	@Override
	public double balanceEnqiry(int actno) {
		// TODO Auto-generated method stub
		double tempBal=0;
		for (int i=0;i<accounts.length;i++) {
			
			if(accounts[i].getActno() == actno){
				tempBal = accounts[i].getBalance();
			break;
			}
			
		}
		return tempBal;
	}
	
	public void addAccount (Account account) {
		if(this.accountIndex < accounts.length) {
			accounts[this.accountIndex++] = account;
		}else
			System.out.println("invalid operation");
		
	}
	
	public void displayacc(int n) {
		System.out.println(n);
	}

}
