package com.gv.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedWriterC {
	
	public static void main(String[] args) throws IOException{
		/*FileWriter fw = new FileWriter("gvk//abc.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(71);
		bw.write("yanvriksh");
		bw.newLine();
		char[] ch = {'a','b','c'};
		bw.write(ch);
		bw.newLine();*/
		
		
		FileWriter fw = new FileWriter("gvk//abc.txt");
		PrintWriter out = new PrintWriter(fw);
		out.write(71);
		out.println("yanvriksh");
		out.println(true);
		out.println('c');
		out.println(22.4);
		
		out.flush();
		out.close();
		
	}

}
