package com.home.thread.runnable;

public class ThreadMainJoin {
	
	public static void main(String[] args){
		ChildThread ct = new ChildThread();
		ChildThread.mainThread = Thread.currentThread();
		ct.start();
		for(int i=0;i<10;i++){
			System.out.println("main thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
