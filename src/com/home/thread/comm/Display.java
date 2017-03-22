package com.home.thread.comm;

public class Display {
	
	public void display(String name) throws InterruptedException{

		synchronized(this){

			for(int i=0;i<5;i++){



				System.out.print("Hello ");

				Thread.sleep(1000);

				System.out.println(name);
			}

		}
	}

}
