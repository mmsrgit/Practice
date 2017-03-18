package com.gv.file;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFile {
	 
    public static void main(String[] args) {
           
            //create file object
            File file = new File("gvk//fm.jpg");
            File fo= new File("gvk//copy.jpg");
            BufferedInputStream bin = null;
           
            try
            {
                    //create FileInputStream object
                    FileInputStream fin = new FileInputStream(file);
                    FileOutputStream fout = new FileOutputStream(fo,true);
                   
                    //create object of BufferedInputStream
                    bin = new BufferedInputStream(fin);
                   
                    //create a byte array
                    byte[] contents = new byte[1024];
                   
                    int bytesRead=0;
                    String strFileContents;
                   int count = 0;
                   bytesRead = bin.read(contents);
                    while(bytesRead != -1){
                           count++;
                            strFileContents = new String(contents, 0, bytesRead);
                            fout.write(bytesRead);
                            bytesRead = bin.read(contents);
                            System.out.print(strFileContents);
                    }
                    System.out.println(count);
                   
            }
            catch(FileNotFoundException e)
            {
                    System.out.println("File not found" + e);
            }
            catch(IOException ioe)
            {
                    System.out.println("Exception while reading the file "+ ioe);
            }
            finally
            {
                    //close the BufferedInputStream using close method
                    try{
                            if(bin != null)
                                    bin.close();
                    }catch(IOException ioe)
                    {
                            System.out.println("Error while closing the stream :"+ ioe);
                    }
                   
            }
    }
   
}
