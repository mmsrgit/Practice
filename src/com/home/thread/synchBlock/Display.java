package com.home.thread.synchBlock;

public final class Display {
	
	public  void display(String name){
		//synchronized(this){
		synchronized(Display.class){
			for(int i =0;i<5;i++){
				System.out.print("Hello ");

				try{
					Thread.sleep(1000);
				}catch(InterruptedException ex){}
				System.out.println(name);
			}
		}

	}

}
