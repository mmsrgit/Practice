package com.home.thread.synch;

public class SynchronizeDemo {
	
	public static void main(String[] args){
		Display d = new Display();
		//Display d2 = new Display();
		MyThread mt1 = new MyThread(d,"Dhoni");
		MyThread mt2 = new MyThread(d,"Yuvraj");
		
		mt1.start();
		mt2.start();
	}

}
