package multithreading;
import java.util.Scanner;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("enter ur input");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
					System.out.println("got the input proceeding");
			
			System.out.println(Thread.currentThread().getName()+"="+i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
