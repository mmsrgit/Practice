package com.home.thread.runnable;

public class TestRunnable {
	
	public static void main(String[] args){
		MyRunnable myRunnable = new MyRunnable();
		Thread t1 = new Thread(myRunnable,"runnableThread");
		t1.start();
		System.out.println(Thread.currentThread().getName());
		
	}

}
