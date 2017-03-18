package com.gv.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterC {
	
	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("gvk//abc.txt");//TODO add second argument
		fw.write(71);
		fw.write("yanvriksh");
		fw.write('\n');
		char[] ch = {'a','b','c'};
		fw.write(ch);
		fw.write('\n');
		fw.flush();
		fw.close();
		
	}

}
