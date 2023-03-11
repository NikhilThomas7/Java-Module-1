package oopsday2.atm;

//import oopsday2.atm.exceptions.InsufficientFundsException;

public interface BankingIface2 {
		
		public double withdraw(double amount, int actno ) ; //throws InsufficientFundsException;
		public double deposit(double amount, int actno );
		public double balanceEnqiry(int actno);
	}
