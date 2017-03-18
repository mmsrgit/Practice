package com.home.thread.runnable;

public class ChildThread extends Thread{
	static Thread mainThread;
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("child thread");
			try {
				mainThread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
