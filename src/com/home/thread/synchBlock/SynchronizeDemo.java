package com.home.thread.synchBlock;

public class SynchronizeDemo {
	
	public static void main(String[] args){
		Display d1 = new Display();
		Display d2 = new Display();
		MyThread mt1 = new MyThread(d1,"Dhoni");
		MyThread mt2 = new MyThread(d2,"Yuvraj");
		
		mt1.start();
		mt2.start();
	}

}
