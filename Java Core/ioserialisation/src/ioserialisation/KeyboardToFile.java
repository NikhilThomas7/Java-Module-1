package ioserialisation;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class KeyboardToFile {
	
	public static void main(String[] args) throws IOException {
		System.out.println("entered main");
		
		String data =null;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		FileWriter writer = new FileWriter("nammadefile.txt");
		System.out.println("enter some text");
		data =reader.readLine();
		System.out.println(" u hav entered " + data);
		while(!data.equals("quit")) {
			writer.write(data);
			data =reader.readLine();
			System.out.println(" u hav entered " + data);
		}
		writer.flush();
		writer.close();
		reader.close();
		System.out.println(" main exited");
		
	
	}
	
	

}
