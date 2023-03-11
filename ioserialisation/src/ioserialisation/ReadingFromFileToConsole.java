package ioserialisation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFileToConsole {

	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("D:\\ustcore\\ioserialisation\\src\\ioserialisation\\KeyboardToFile.java");
		BufferedReader buffer = new BufferedReader(reader);
		String data = buffer.readLine();
		
				
		while(data !=null) {
			while(data != null) {
				System.out.println(data);
				 data = buffer.readLine();
			}
		}
		
		

	}

}
