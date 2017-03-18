package com.gv.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderC {
	
	public static void main(String[] args) throws IOException{
		/*FileReader fr = new FileReader("gvk//abc.txt");
		int i = fr.read();
		while(i!=-1){
			System.out.println((char)i);
			i = fr.read();
		}
		fr.close();*/
		 
		
		File f = new File("gvk//abc.txt");
		FileReader fr = new FileReader(f);
		char[] ch = new char[(int)f.length()];
		fr.read(ch);
		for(char c:ch){
			System.out.print(c);
			
		}
		fr.close();
	}

}
