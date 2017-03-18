package com.gv.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderC {
	
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("gvk//abc.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		
		while(null != line){
			System.out.println(line);
			line = br.readLine();
		}
		fr.close();
				
	}

}
