package com.gv.file;

import java.io.File;
import java.io.IOException;

public class FileC {
	
	public static void main(String[] args) throws IOException{
		/*File f = new File("abc.txt");
		System.out.println(f.exists());
		f.createNewFile();*/
		
		
		/*File f = new File("gvk");
		System.out.println(f.exists());
		f.mkdir();*/
		
		File f = new File("gvk");
		File f1 = new File(f,"abc.txt");
		System.out.println(f1.exists());
		//f1.exists();
		f1.createNewFile();
		
	}

}
