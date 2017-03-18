package com.home.thread.runnable;

public class ChildInterrupt extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("child thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted");
				e.printStackTrace();
			}
		}
	}
}
