package com.gv.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) {
		FileReader file;
		try {
			file = new FileReader("C:\\test\\a.txt");

			BufferedReader fileInput = new BufferedReader(file);

			// Print first 3 lines of file "C:\test\a.txt"
			for (int counter = 0; counter < 3; counter++) 
				System.out.println(fileInput.readLine());

			fileInput.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
