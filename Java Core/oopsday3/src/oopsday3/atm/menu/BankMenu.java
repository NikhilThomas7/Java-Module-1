package oopsday3.atm.menu;

//import oopsday3.atm.menu.Account;
//import oopsday3.atm.menu.BankOfAmerica2;
import java.util.Scanner;


public class BankMenu {
	BankOfAmerica2 boa = new BankOfAmerica2();
	public BankMenu() {
		Account a1 = new Account(101,"john doe","savings",500);
		Account a2 = new Account(102,"jone doe","savings",500);
		Account a3 = new Account(103,"jo doe","savings",500);
		Account a4 = new Account(104,"johny doe","savings",500);
		Account a5 = new Account(104,"jany doe","savings",500);
		
		boa.addAccount(a1);
		boa.addAccount(a2);
		boa.addAccount(a3);
		boa.addAccount(a4);
		boa.addAccount(a5);
	}
	
	
	

	public void menu() {
		
		Scanner scanner = new Scanner(System.in);
		int choice =0;
		loop: do {
			
			System.out.println("Enter your choice 1..5");
		System.out.println("2.deposit");
		System.out.println("3.withdraw");
		System.out.println("4.balance enquiry");
		System.out.println("5.exit");

		choice = scanner.nextInt();
				
	
	
	
	switch(choice) {
	case 1:{
		System.out.println("enter actno");
		int actno =scanner.nextInt();
		boa.displayacc(actno);
		
				//System.out.println(boa.withdraw(500,1));
	}
	case 2:{
		double balance = boa.deposit(200, 101);
		System.out.println(balance);
		break;
		//System.out.println("case2");
	}
	case 3:{
		double withdraw;
		try {
			withdraw = boa.withdraw(100, 103);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(withdraw);
		break;
	}
	case 4:{
		double balanceenquiry =boa.balanceEnqiry(101);
		System.out.println(balanceenquiry);
		break;
	}
	case 5:{
		System.out.println("exiting.....");
		break;
	}
	}
	}while(choice != 5);

		
		}
}
