package com.gv.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PrintWriterC {
	
	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("gvk//abc.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(71);
		bw.write("yanvriksh");
		bw.newLine();
		char[] ch = {'a','b','c'};
		bw.write(ch);
		bw.newLine();
		
		bw.flush();
		bw.close();
		
	}

}
