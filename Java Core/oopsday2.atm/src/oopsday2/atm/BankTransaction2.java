package oopsday2.atm;

//import oopsday2.atm.exceptions.InsufficientFundsException;

public class BankTransaction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account(101,"john doe","savings",500);
		Account a2 = new Account(102,"jone doe","savings",500);
		Account a3 = new Account(103,"jo doe","savings",500);
		Account a4 = new Account(104,"johny doe","savings",500);
		Account a5 = new Account(104,"jany doe","savings",500);
		
		BankOfAmerica2 boa = new BankOfAmerica2();
		boa.addAccount(a1);
		boa.addAccount(a2);
		boa.addAccount(a3);
		boa.addAccount(a4);
		boa.addAccount(a5);
		
		System.out.println(boa.balanceEnqiry(103));
		double result = boa.deposit(100, 103);
		System.out.println(result);
		try {
			result = boa.withdraw(50, 103);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);
	}

}
