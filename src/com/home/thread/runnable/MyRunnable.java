package com.home.thread.runnable;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("Child thread");
		}
		System.out.println("In run "+Thread.currentThread().getName());

	}

}
