package com.home.thread.synch;

public final class Display {
	
	public static synchronized void display(String name){
		for(int i =0;i<5;i++){
			System.out.print("Hello ");
			
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ex){}
			System.out.println(name);
		}
		
	}

}
